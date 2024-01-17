import java.util.Queue;
import java.util.LinkedList;

public class Order {
    private Queue<OrderItem> orderQueue;

    public Order() {
        this.orderQueue = new LinkedList<>();
    }

    public void addOrder(String lastName, int orderNumber, double orderTotalCost) {
        OrderItem newOrder = new OrderItem(lastName, orderNumber, orderTotalCost);
        orderQueue.add(newOrder);
    }

    public Queue<OrderItem> getOrderQueue() {
        return orderQueue;
    }
}
