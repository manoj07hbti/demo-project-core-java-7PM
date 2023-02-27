package oops.abstraction;

public class GooglePay implements PaymentApp {
    @Override
    public void checkBalance() {

        System.out.println("Google Pay check balance method ");
    }

    @Override
    public void scanQR() {

        System.out.println("Google Pay scanQR  method ");
    }

    @Override
    public void makePayment() {

        System.out.println("Google Pay makePayment  method ");

    }
}
