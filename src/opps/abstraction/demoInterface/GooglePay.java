package opps.abstraction.demoInterface;

public class GooglePay implements PaymentApp{
    @Override
    public void checkBalance() {
        System.out.println("GooglePay check balance Method");
    }

    @Override
    public void scanQR() {
        System.out.println("GooglePay scanQR Method");
    }

    @Override
    public void makePayment() {
        System.out.println("GooglePay make payment Method");
    }

    public static void main(String[] args) {
        GooglePay obj= new GooglePay();
        obj.checkBalance();
        obj.scanQR();
        obj.makePayment();
    }
}
