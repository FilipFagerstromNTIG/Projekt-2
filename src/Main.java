import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            OrderManager manager = new OrderManager();

            while (true) {
                System.out.println("");
                System.out.println("Welcome to the Building Management System!");
                System.out.println("1. Add Villa order");
                System.out.println("2. Add Garage order");
                System.out.println("3. Remove order");
                System.out.println("4. List orders");
                System.out.println("5. Show total profit");
                System.out.println("6. Exit");

                int choice = 0;

                while (choice < 1 || choice > 6) {
                    System.out.println("");
                    System.out.print("Choice: ");
                    String choiceString = sc.nextLine();
                    System.out.println("");

                    try {
                        choice = Integer.parseInt(choiceString);
                    } catch (NumberFormatException e) {
                    }

                    if (choice < 1 || choice > 6) {
                        System.out.println("Error: not a valid input. Please enter a new number");
                    }
                }

                if (choice == 1) {
                    System.out.print("Customer name: ");
                    String name = sc.nextLine();

                    Building b = new Villa();
                    manager.addOrder(name, b);

                    System.out.println("Villa order added for " + name);

                } else if (choice == 2) {
                    System.out.print("Customer name: ");
                    String name = sc.nextLine();

                    Building b = new Garage();
                    manager.addOrder(name, b);

                    System.out.println("Garage order added for " + name);

                } else if (choice == 3) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    manager.removeOrder(id);

                } else if (choice == 4) {
                    manager.listOrders();

                } else if (choice == 5) {
                    System.out.println(manager.getTotalProfit());

                } else if (choice == 6) {
                }
            }
        }
    }
}