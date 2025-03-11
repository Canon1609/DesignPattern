package iuh.fit.state_of_table_in_restaurant;

import java.util.Scanner;

public class DoneState implements TableState {
    @Override
    public void next(Table table) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🟢 Chọn trạng thái tiếp theo: (1) Free, (2) Fixing");
        int choice = scanner.nextInt();

        if (choice == 2) {
            System.out.println("🔴 Chuyển sang trạng thái Fixing (Đang sửa chữa).");
            table.setState(new FixingState());
        } else {
            System.out.println("🟢 Chuyển về Free (Bàn trống).");
            table.setState(new FreeState());
        }
    }

    @Override
    public void printStatus() {
        System.out.println("🟡 Bàn đã hoàn tất phục vụ (Done).");
    }
}
