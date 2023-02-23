package opps.inheritance.abstraction;

public class PhonePay implements PaymentApp{
    @Override
    public void checkBalance() {
        System.out.println("PhonePay checkBalance method");

    }

    @Override
    public void scanQR() {
        System.out.println("Phone pay scanQR method");

    }

    @Override
    public void makePayment() {
        System.out.println("Phone pay makePayment method");

    }
}
