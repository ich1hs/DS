import java.util.LinkedList;

public class FoodOrder {*
    private String orderCode;
    private Customer<?> customer;
    private LinkedList<OrderItem> items = new LinkedList<>();

    public FoodOrder(String orderCode, Customer<?> customer) {
        this.orderCode = orderCode;
        this.customer = customer;
    }

    public String getOrderCode() {
        return orderCode;
    }
    public Customer<?> getCustomer() {
        return customer;
    }
    public LinkedList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    // Method dengan wildcard (<?>) untuk menampilkan info pelanggan
    public static void printCustomerInfo(Customer<?> c) {
        System.out.println("Customer Name    : " + c.getName());
        System.out.println("Customer ID      : " + c.getId());
        System.out.println("Customer ID Type : " + c.getId().getClass().getSimpleName());
    }

    public void displayOrder() {
        System.out.println("=================================");
        System.out.println("Order Code       : " + orderCode);
        printCustomerInfo(customer);
        System.out.println("Ordered Items:");
        for (OrderItem item : items) {
            System.out.println("  - " + item);
        }
    }
}