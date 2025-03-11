package iuh.fit.state_of_table_in_restaurant;

public class FreeState implements TableState {
    @Override
    public void next(Table table) {
        System.out.println("🟠 Chuyển sang trạng thái Order (Có khách đặt bàn).");
        table.setState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("🟢 Bàn đang trống (Free).");
    }
}
