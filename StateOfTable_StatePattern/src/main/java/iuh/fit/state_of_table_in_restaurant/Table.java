package iuh.fit.state_of_table_in_restaurant;

public class Table {
    private TableState state;

    public Table() {
        this.state = new FreeState(); // Mặc định bàn bắt đầu ở trạng thái Free
    }

    public void setState(TableState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
