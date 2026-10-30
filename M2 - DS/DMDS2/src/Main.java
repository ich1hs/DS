import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        System.out.println("=== Food Ordering System ===");
        String anotherOrder;
        do {
            System.out.println();
            System.out.println("--- Entering Customer Order ---");
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Customer ID: ");
            String idInput = sc.nextLine();
            Customer<?> customer;
            try {
                customer = new Customer<Long>(name, Long.parseLong(idInput));
            } catch (NumberFormatException e) {
                customer = new Customer<String>(name, idInput);
            }
            System.out.print("Enter Order Code: ");
            String code = sc.nextLine();
            FoodOrder order = new FoodOrder(code, customer);

            String anotherItem;
            do {
                System.out.print("Enter Menu Name: ");
                String menu = sc.nextLine();
                System.out.println("Select Food Category:");
                FoodCategory[] cats = FoodCategory.values();
                for (int i = 0; i < cats.length; i++) {
                    System.out.println((i + 1) + ". " + cats[i]);
                }
                System.out.print("Enter choice: ");
                int choice = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Quantity: ");
                int qty = Integer.parseInt(sc.nextLine());
                order.addItem(new OrderItem(menu, cats[choice - 1], qty));

                System.out.print("Add another item to this order? (y/n): ");
                anotherItem = sc.nextLine();
            } while (anotherItem.equalsIgnoreCase("y"));

            manager.addOrder(order);
            System.out.println();
            System.out.print("Add another customer order? (y/n): ");
            anotherOrder = sc.nextLine();
        } while (anotherOrder.equalsIgnoreCase("y"));

        System.out.println();
        manager.displayAllOrders();
        sc.close();
    }
}