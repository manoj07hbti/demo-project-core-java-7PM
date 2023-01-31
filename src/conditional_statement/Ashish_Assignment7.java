package conditional_statement;

public class Ashish_Assignment7 {
    public static void main(String[] args) {
        int price = 1200;
        String brand = "IBM";
        if ((brand=="IBM") & (price<1000)) {
                System.out.println("Low price products of " +brand);
            }
        else if ((brand=="IBM") & (price>1000 & price<5000)) {
            System.out.println("Medium price products of " +brand);
        }
        else if ((brand=="IBM") & (price>5000)) {
            System.out.println("High price products of " +brand);
        }
        else{
            System.out.println("Products are out of brands and out of price");
        }

        }
    }


