package conditional_statements;

public class If_Multiple_Condition_Assigenment_31_jan {

    public static void main(String[] args) {

        //Assignment 31 jan//

        //Brand : IBM//
        //PRICE <1000 : PRINT Low price product//

        String Brand;
        int price;
        Brand = "IBM";
        price = 900;
        if (price < 1000 & Brand == "IBM") {
            System.out.println("Low price product..");
        } else {
            System.out.println("Medium price product..");
        }

        //Brand IBM//
        //Price >1000 and <5000 : Print Medium price product//

        price = 3500;
        if (price > 1000 & price < 5000 & Brand == "IBM") {
            System.out.println("Medium price product..");
        } else {
            System.out.println("High price product..");
        }

        //Brand IBM//
        //Price >5000 : Print High price product//

        price = 6000;
        if (price > 5000 & Brand == "IBM") {
            System.out.println("High price product..");
        } else {
            System.out.println("Very expensive product.");
        }
    }
}
