package method_or_function;

public class Calculator {

    // SYNTAX : access_specifier return_type method_name (parameter) {CODE...}

    // Create calculator app with basic add , sub , multi , divide

    public void add() {

        //Add method//

        int a = 5;
        int b = 6;

        int sum = a + b;

        System.out.println("Sum of a and b is :" + sum);
    }

    //Subtract method//

    public void subtract() {

        int a = 9;
        int b = 5;

        int subtract = a - b;
        System.out.println("Subtract of a and b is :" + subtract);
    }

    //Multiply Method//

    public void multiply() {

        int a = 2;
        int b = 7;

        int multi = a * b;
        System.out.println("Multiply of a and b is :" + multi);
    }

    //Divide method //

    public void divide() {

        int a = 56;
        int b = 3;

        double divide = (double) a / b;
        System.out.println("Division is :" + divide);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }

}
