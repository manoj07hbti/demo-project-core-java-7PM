package opps.abstraction.demoInterface;

public class PhonePe implements PaymentApp{
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
        PhonePe obj= new PhonePe();
        obj.checkBalance();
        obj.scanQR();
        obj.makePayment();
    }
}
