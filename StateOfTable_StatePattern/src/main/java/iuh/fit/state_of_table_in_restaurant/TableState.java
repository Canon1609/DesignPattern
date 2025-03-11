package iuh.fit.state_of_table_in_restaurant;

public interface TableState {
    void next(Table table);
    void printStatus();
}
