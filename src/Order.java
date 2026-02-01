public class Order {
    private int id;
    private String customerName;
    private Building building;

    public Order(int id, String name, Building building) {
        this.id = id;
        this.customerName = name;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return building.getPrice();
    }

    public String toString() {
        return "Order ID: " + id + ", Customer: " + customerName + ", Building Type: " + building.getType() + ", Price: " + getPrice();
    }
}