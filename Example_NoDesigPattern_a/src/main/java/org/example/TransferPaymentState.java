package org.example;

public class TransferPaymentState implements PaymentState{
    @Override
    public String getPaymentDescription() {
        return "Thanh toan bang chuyen khoan";
    }
}
