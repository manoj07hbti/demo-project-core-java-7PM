package method_or_function;

public class MethodInputParameter {

    // SYNTAX:- access_specifier return_type method_name(parameter){Code}

    public void cubeMethod(int number) {

        int cube = number * number * number;

        System.out.println("Cube of " + number + " is:- " + cube);
    }

    public void voting(int age, String city) {

        if (age >= 18 & city == "Agra") {

            System.out.println("Eligible for voting");
        } else

            System.out.println("Not eligible for voting");
    }

    public void Even_Odd(int number) {

        if (number % 2 == 0) {

            System.out.println(number + " :-Number is even");
        } else {

            System.out.println(number + " :-Number is odd");
        }
    }

    public void PrimeNumber(int number) {

        boolean flag = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                flag = false;

            }

        }
        if (flag) {

            System.out.println("This is prime no......" + number);
        } else {

            System.out.println("This is not prime no....." + number);
        }
    }

    public void Factorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {

            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is:- " + factorial);
    }

    public void Calculate_Percentage(double number, double percentage) {

        double result = (double) (number * percentage / 100);

        System.out.println(percentage + " %" + " of " + number + " is:- " + result);


    }


    public static void main(String[] args) {

        // SYNTAX:- ClassName objName = new ClassName();

        MethodInputParameter obj = new MethodInputParameter();

        // SYNTAX:- objName.MethodName(Value);

        obj.cubeMethod(3);
        obj.cubeMethod(6);
        obj.cubeMethod(98);

        obj.voting(18, "Agra");
        obj.voting(14, "kanpur");
        obj.voting(19, "Agra");

        obj.Even_Odd(43);
        obj.Even_Odd(54);
        obj.Even_Odd(80);

        obj.PrimeNumber(65);
        obj.PrimeNumber(76);

        obj.Factorial(3);
        obj.Factorial(5);

        obj.Calculate_Percentage(100, 10);
        obj.Calculate_Percentage(540, 54);
        obj.Calculate_Percentage(600, 5.67);


    }
}
