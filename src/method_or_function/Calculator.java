package method_or_function;

public class Calculator {

    public void add() {

        int a = 4;
        int b = 6;

        int sum = a + b;
        System.out.println("addition is : " + sum);
    }

    public void sub() {

        int a = 10;
        int b = 4;

        int sub = a - b;
        System.out.println("sub is : " + sub);
    }

    public void devide() {
        int a = 56;
        int b = 3;

        double dev = (double) a / b;

        System.out.println("divde is : " + dev);
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add();
        obj.sub();
        obj.devide();
    }

}