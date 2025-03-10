package iuh.fit.position;

import java.util.Scanner;

/*
(b) Tính lương nhân viên
Lương = Lương cơ bản + Phụ cấp theo chức vụ (TP, HT, PHT, TT, TK, PK).
Mỗi nhân viên có một chức vụ cố định, không thể thay đổi sau khi tạo.
Dùng Factory Pattern vì:
Mỗi chức vụ có cách tính lương riêng, cần tạo đối tượng phù hợp ngay từ đầu.
Giúp tách biệt logic khởi tạo, tránh dùng nhiều if-else.
Dễ mở rộng khi thêm chức vụ mới.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên nhân viên:");
        String name = scanner.nextLine();

        String role;
        while (true) {
            System.out.println("Nhập chức vụ (manager/headteacher/viceprincipal):");
            role = scanner.nextLine().toLowerCase();

            if (role.equals("manager") || role.equals("headteacher") || role.equals("viceprincipal")) {
                break; // Nhập đúng thì thoát vòng lặp
            } else {
                System.out.println("Chức vụ không hợp lệ, vui lòng nhập lại!");
            }
        }

        System.out.println("Nhập lương cơ bản:");
        double baseSalary = scanner.nextDouble();

        Employee employee = EmployeeFactory.createEmployee(role, name, baseSalary);
        employee.printSalary();
    }
}