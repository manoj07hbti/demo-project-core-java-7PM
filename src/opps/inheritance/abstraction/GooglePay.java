package opps.inheritance.abstraction;

public class GooglePay implements PaymentApp{
    @Override
    public void checkBalance() {
        System.out.println("GooglePay checkBalance method");

    }

    @Override
    public void scanQR() {
        System.out.println("Google pay scanQR method");

    }

    @Override
    public void makePayment() {
        System.out.println("Google pay makePayment method");

    }
}
