package opps.inheritance.abstraction;

public class PayTM implements PaymentApp{
    @Override
    public void checkBalance() {
        System.out.println("PayTM checkBalance method");
    }

    @Override
    public void scanQR() {
        System.out.println("PayTM scanQR method");

    }

    @Override
    public void makePayment() {
        System.out.println("PayTM makePayment method");

    }
}
