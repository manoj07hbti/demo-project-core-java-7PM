package method_or_function.method_or_function;

public class Calculator_ReturnType {


    public int add(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public int subtract(int a, int b) {

        int sub = a - b;

        return sub;

    }

    public int multiply(int a, int b) {

        int multi = a * b;

        return multi;
    }
    public double divide(int a, int b) {

           double divide = (double) a / (double) b;

            return divide;

    }
    public static void main(String args[]) {
        Calculator_ReturnType obj = new Calculator_ReturnType();

        int sum = obj.add(4, 7);

        System.out.println("Sum is " + sum);

        int sub = obj.subtract(20, 10);

        System.out.println("sub is " + sub);

        int multi = obj.multiply(15, 5);

        System.out.println("multi is " + multi);

        double divide = obj.divide(20, 3);

        System.out.println("divide is " + divide);

    }

}



































