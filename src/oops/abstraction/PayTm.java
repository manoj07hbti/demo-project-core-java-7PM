package oops.abstraction;

public class PayTm implements PaymentApp {
    @Override
    public void checkBalance() {
        System.out.println("PayTm  check balance method ");
    }

    @Override
    public void scanQR() {

        System.out.println("PayTm  scanQR method ");
    }

    @Override
    public void makePayment() {

        System.out.println("PayTm  makePayment method ");
    }
}
