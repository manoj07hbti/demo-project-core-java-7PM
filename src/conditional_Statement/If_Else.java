package conditional_Statement;

public class If_Else {
    public static void main(String[] args) {
        //price>1000and <5000: print medium price and brand


       int price=3000;
       String brand="IBM";
            if (price > 1000 & price < 5000 & brand == "IBM") {
                System.out.println("Medium price product..");
            } else {
                System.out.println("High price product..");
            }
    }
}
