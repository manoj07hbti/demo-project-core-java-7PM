package condtional_statements;

public class AssignmentDay12th {
    public static void main(String[] args) {

        String Brand = "IBM";
        int Price = 4550;

        if (Brand == "IBM") {

            if (Price <= 1000) {

                System.out.println("Low price product.");
            }

            if (Price > 1000 & Price < 5000) {

                System.out.println("Medium price product.");
            }

            if (Price >= 5000) {

                System.out.println("High price product.");
            }
        }
        else {

            System.out.println("Product is not IBM brand.");
        }
    }
}


