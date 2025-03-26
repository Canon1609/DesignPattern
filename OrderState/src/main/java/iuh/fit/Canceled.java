package iuh.fit;

public class Canceled implements OrderState {

    @Override
    public void handle(OrderContext context) {
        System.out.println("Canceled");

    }
}
