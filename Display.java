import java.util.ArrayList;
import java.util.Collections;

public class Display {
    private ArrayList<OrderItem> orderListByName;
    private ArrayList<OrderItem> orderListByNumber;

    public Display() {
        this.orderListByName = new ArrayList<>();
        this.orderListByNumber = new ArrayList<>();
    }

    public void updateDisplay(OrderItem newOrder) {
        orderListByName.add(newOrder);
        orderListByNumber.add(newOrder);

        Collections.sort(orderListByName, (o1, o2) -> o2.getLastName().compareTo(o1.getLastName()));
        Collections.sort(orderListByNumber, (o1, o2) -> Integer.compare(o2.getOrderNumber(), o1.getOrderNumber()));

        displayOrders();
    }

    private void displayOrders() {
        System.out.println("Orders sorted by name: " + orderListByName);
        System.out.println("Orders sorted by order number: " + orderListByNumber);
    }
}
