public class OrderItem {
    private String menuName;
    private FoodCategory category;
    private int quantity;

    public OrderItem(String menuName, FoodCategory category, int quantity) {
        this.menuName = menuName;
        this.category = category;
        this.quantity = quantity;
    }

    public String getMenuName() {
        return menuName;
    }
    public FoodCategory getCategory() {
        return category;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return menuName + " x" + quantity + " (" + category + ")";
    }
}