package condtional_statements;

public class DemoNestedIfElseAssignment {
    public static void main(String[] args) {

        int number = 50;

        if (number != 0) {

            if (number / 5 == 0) {

                System.out.println("Number is Divisible by 5");
            }
            else {

                System.out.println("Number is not divisible by 5");
            }

        }


           String country = "PAKISTAN";

            if (country == "INDIA") {

                System.out.println("Person belongs to INDIA");
            }
            else {

                System.out.println("Person belongs to FOREIGNER");
        }

    }
}

