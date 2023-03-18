package opps.abstraction.demoInterface;

public class Paytm implements PaymentApp{
    @Override
    public void checkBalance() {
        System.out.println("PhonePe check balance Method");
    }

    @Override
    public void scanQR() {
        System.out.println("PhonePe scanQR Method");
    }

    @Override
    public void makePayment() {
        System.out.println("PhonePe make payment Method");
    }

    public static void main(String[] args) {
        Paytm obj= new Paytm();
        obj.checkBalance();
        obj.scanQR();
        obj.makePayment();
    }
}
