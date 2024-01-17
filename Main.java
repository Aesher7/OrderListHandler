import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Display display = new Display();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Order");
            System.out.println("2. Remove Order");
            System.out.println("3. Display Orders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter order number: ");
                    int orderNumber = scanner.nextInt();
                    System.out.print("Enter order total cost: ");
                    double orderTotalCost = scanner.nextDouble();

                    order.addOrder(lastName, orderNumber, orderTotalCost);
                    display.updateDisplay(new OrderItem(lastName, orderNumber, orderTotalCost));
                    break;

                case 2:
                   
                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

