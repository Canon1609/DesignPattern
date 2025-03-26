package iuh.fit;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrder();
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
