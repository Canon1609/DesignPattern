package iuh.fit.paymentmethod;

import iuh.fit.strategy.PaymentStrategy;

public class BankPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng chuyển khoản ngân hàng.");
    }
}
