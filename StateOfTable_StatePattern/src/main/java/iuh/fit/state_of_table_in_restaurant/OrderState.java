package iuh.fit.state_of_table_in_restaurant;


public class OrderState implements TableState {
    @Override
    public void next(Table table) {
        System.out.println("🟡 Chuyển sang trạng thái Done (Hoàn tất phục vụ).");
        table.setState(new DoneState());
    }

    @Override
    public void printStatus() {
        System.out.println("🟠 Bàn đang có khách (Order).");
    }
}
