package opps.abstraction;

public class TwoWheeler extends Vehicle{

    public void servicing(double price){
        System.out.println("Two Wheeler servicing Amount : "+price);
    }

    public static void main(String[] args) {
        TwoWheeler t= new TwoWheeler();
        t.servicing(100.4);
    }

}
