package org.example;

public class Order {
    private int orderID;
    private PaymentState paymentState;

    public Order(int orderID, PaymentState paymentState) {
        this.orderID = orderID;
        this.paymentState = paymentState;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getPayment() {
        return paymentState.getPaymentDescription();
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }
}
