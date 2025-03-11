package iuh.fit;

import iuh.fit.state_of_table_in_restaurant.Table;

import java.util.Scanner;
/*
🔹 (c) Trạng thái của Table trong nhà hàng
Một bàn có thể chuyển qua lại giữa nhiều trạng thái: Free → Order → Done → Free → Fixing → Done → Free.
Điều này phù hợp với State Pattern, vì trạng thái của bàn thay đổi theo từng giai đoạn.
=> State Pattern
🟢 Bàn đang trống (Free).
Nhấn Enter để chuyển sang trạng thái tiếp theo...

🟠 Chuyển sang trạng thái Order (Có khách đặt bàn).
🟠 Bàn đang có khách (Order).
Nhấn Enter để chuyển sang trạng thái tiếp theo...

🟡 Chuyển sang trạng thái Done (Hoàn tất phục vụ).
🟡 Bàn đã hoàn tất phục vụ (Done).
Nhấn Enter để chuyển sang trạng thái tiếp theo...

🟢 Chuyển về Free hoặc Fixing (Đang sửa chữa).
🟢 Bàn đang trống (Free).
Nhấn Enter để chuyển sang trạng thái tiếp theo...

 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            table.printStatus();
            System.out.println("Nhấn Enter để chuyển sang trạng thái tiếp theo...");
            scanner.nextLine();
            table.nextState();
        }
    }
}