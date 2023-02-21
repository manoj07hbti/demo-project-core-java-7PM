package condtional_statements;

public class DemoNestedIfElse {
    public static void main(String[] args) {

        int number = 56;
        if (number > 0) {

            if (number % 2 == 0) {
                System.out.println("Number is Even");
            }
            else {
                System.out.println("Number is Odd");
            }

        }
        else {
            System.out.println("Number is less than zero");
        }

    }
}
