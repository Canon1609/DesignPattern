package iuh.fit;

public class NewOrder implements OrderState {

    @Override
    public void handle(OrderContext context) {
        System.out.println("New order");
        context.setState(new Delivered());
    }
}
