package iuh.fit.state_of_table_in_restaurant;

public class FixingState implements TableState {
    @Override
    public void next(Table table) {
        System.out.println("🟢 Chuyển sang trạng thái Free (Sửa xong).");
        table.setState(new FreeState());
    }

    @Override
    public void printStatus() {
        System.out.println("🔴 Bàn đang sửa chữa (Fixing).");
    }
}
