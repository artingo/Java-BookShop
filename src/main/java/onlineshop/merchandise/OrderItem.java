package onlineshop.merchandise;

public class OrderItem extends CartItem {
    private double discount;
    private double shippingCost;
    private double taxAmount;

    public OrderItem() { }

    public OrderItem(CartItem cartItem) {
        // TODO: implement this
    }

    public OrderItem(CartItem cartItem, double discount, double shippingCost, double taxAmount) {
        this(cartItem);
        // TODO: copy the fields
    }

    // TODO: generate Getters/Setters

}
