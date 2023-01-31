Cgit cpackage Conditional_statement;

public class Demo_NestedIf {
    public static void main(String args[]) {

        int number = 8000;
        if (number > 100) {
            if (number % 100 == 0) {
                System.out.println("Number is divisible by 100");
            } else {
                System.out.println("nuber is not  divisible by 100");
            }

        } else {
            System.out.println("Nuber is less than zero");


        }
    }
}
