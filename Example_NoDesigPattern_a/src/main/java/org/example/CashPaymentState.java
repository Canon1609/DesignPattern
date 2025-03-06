package org.example;

public class CashPaymentState implements PaymentState{
    @Override
    public String getPaymentDescription() {
        return "Thanh toan bang tien mat";
    }
}
