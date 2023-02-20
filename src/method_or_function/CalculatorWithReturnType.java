package method_or_function;

public class CalculatorWithReturnType {

    //Calculator with return type//

    public int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public int subtract(int a, int b) {
        int sub = a - b;
        return sub;

    }

    public int multiplication(int a, int b) {
        int multi = a * b;
        return multi;

    }

    public double divide(int a, int b) {
        double div = a / b;
        return div;

    }

    public static void main(String[] args) {
        CalculatorWithReturnType obj = new CalculatorWithReturnType();
        int sum = obj.add(5, 5);
        System.out.println("Sum of a+b is :" + sum);

        int sub = obj.subtract(8, 4);
        System.out.println("Subtraction of a-b is :" + sub);

        int multi = obj.multiplication(5, 5);
        System.out.println("Multiplication of a and b is :" + multi);

        double div = obj.divide(125, 5);
        System.out.println("Division of a/b is :" + div);


    }


}
