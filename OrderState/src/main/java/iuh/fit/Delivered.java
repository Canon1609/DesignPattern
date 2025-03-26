package iuh.fit;

public class Delivered implements OrderState {

    @Override
    public void handle(OrderContext context) {

        System.out.println("Delivered");
        context.setState(new Canceled());
    }
}
