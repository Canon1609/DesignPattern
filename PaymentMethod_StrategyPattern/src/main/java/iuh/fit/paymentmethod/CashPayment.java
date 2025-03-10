package iuh.fit.paymentmethod;

import iuh.fit.strategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng tiền mặt.");
    }
}
