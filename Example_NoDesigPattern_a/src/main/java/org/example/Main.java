package org.example;

public class Main {
    public static void main(String[] args) {
        // Tạo các trạng thái thanh toán
        PaymentState cashPayment = new CashPaymentState();
        PaymentState transferPayment = new TransferPaymentState();
        PaymentState vnPayPayment = new VNPayPaymentState();

        // Tạo các đơn hàng với trạng thái thanh toán tương ứng
        Order o1 = new Order(1, cashPayment);
        Order o2 = new Order(2, transferPayment);
        Order o3 = new Order(3, vnPayPayment);

        // In ra mô tả thanh toán cho mỗi đơn hàng
        System.out.println(o1.getPayment());
        System.out.println(o2.getPayment());
        System.out.println(o3.getPayment());
    }
}
