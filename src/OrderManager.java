
import java.util.ArrayList;

public class OrderManager {

    private ArrayList<Order> orders = new ArrayList<Order>();
    private int nextId = 1;

    public void addOrder(String name, Building building) {
        Order o = new Order(nextId, name, building);
        orders.add(o);
        nextId++;
    }

    public void removeOrder(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                orders.remove(i);
                return;
            }
        }
    }

    public void listOrders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }

    public int getTotalProfit() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum = sum + orders.get(i).getPrice();
        }
        return sum;
    }
}