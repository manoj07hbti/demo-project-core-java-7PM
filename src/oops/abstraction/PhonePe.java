package oops.abstraction;

public class PhonePe implements PaymentApp {
    @Override
    public void checkBalance() {
        System.out.println("PhonePe  check balance method ");
    }

    @Override
    public void scanQR() {
        System.out.println("PhonePe  scanQR method ");
    }

    @Override
    public void makePayment() {

        System.out.println("PhonePe  makePayment method ");
    }
}
