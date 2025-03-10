package iuh.fit.paymentmethod;

import iuh.fit.strategy.PaymentStrategy;

public class MomoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng MoMo.");
    }
}