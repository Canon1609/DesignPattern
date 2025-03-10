package iuh.fit;

// Main.java
import java.util.Scanner;

import iuh.fit.Context.PaymentContext;
import iuh.fit.paymentmethod.BankPayment;
import iuh.fit.paymentmethod.CashPayment;
import iuh.fit.paymentmethod.MomoPayment;

/*
 (a) Hình thức thanh toán cho Đơn hàng
Các phương thức thanh toán không có sự chuyển đổi giữa chúng.
Khi người dùng chọn một phương thức, nó sẽ hoạt động độc lập.
Điều này phù hợp với Strategy Pattern,
vì mỗi phương thức thanh toán là một chiến lược riêng biệt,
không ảnh hưởng đến các phương thức khác
=>Strategy Pattern. Code sẽ dễ dàng mở rộng khi cần thêm phương thức thanh toán mới.
 */
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        String method;
        while (true) {
            System.out.println("Chọn phương thức thanh toán: (cash/bank/momo)");
            method = scanner.nextLine().toLowerCase();

            if (method.equals("cash")) {
                paymentContext.setPaymentStrategy(new CashPayment());
                break;
            } else if (method.equals("bank")) {
                paymentContext.setPaymentStrategy(new BankPayment());
                break;
            } else if (method.equals("momo")) {
                paymentContext.setPaymentStrategy(new MomoPayment());
                break;
            } else {
                System.out.println("Phương thức thanh toán không hợp lệ, vui lòng nhập lại!");
            }
        }
        // Thực hiện thanh toán
        System.out.println("Nhập số tiền cần thanh toán:");
        double amount = scanner.nextDouble();
        paymentContext.executePayment(amount);
    }
}
