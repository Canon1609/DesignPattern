package iuh.fit.Context;

import iuh.fit.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Hàm thiết lập chiến lược thanh toán
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Hàm thực hiện thanh toán
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Vui lòng chọn phương thức thanh toán.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}