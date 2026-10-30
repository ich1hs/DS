import java.util.ArrayList;

public class OrderManager {
    private ArrayList<FoodOrder> orders = new ArrayList<>();

    public void addOrder(FoodOrder order) {
        orders.add(order);
    }

    public void displayAllOrders() {
        System.out.println("=================================");
        System.out.println("=== ALL ACTIVE ORDERS ===");
        System.out.println();
        if (orders.isEmpty()) {
            System.out.println("No active orders.");
            return;
        }
        for (FoodOrder order : orders) {
            order.displayOrder();
            System.out.println();
        }
    }

    public FoodOrder findOrder(String orderCode) {
        for (FoodOrder order : orders) {
            if (order.getOrderCode().equalsIgnoreCase(orderCode)) {
                return order;
            }
        }
        return null;
    }

    public boolean removeOrder(String orderCode) {
        FoodOrder order = findOrder(orderCode);
        if (order != null) {
            orders.remove(order);
            return true;
        }
        return false;
    }
}