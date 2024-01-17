public class OrderItem {
    private String lastName;
    private int orderNumber;
    private double orderTotalCost;

    public OrderItem(String lastName, int orderNumber, double orderTotalCost) {
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.orderTotalCost = orderTotalCost;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getOrderTotalCost() {
        return orderTotalCost;
    }
}
