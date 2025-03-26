package iuh.fit;

public class Main {
    public static void main(String[] args) {

        OrderContext context = new OrderContext();

        context.handle();
        while (true) {
            System.out.println("Press Enter to change state");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
            context.handle();
        }



    }
}