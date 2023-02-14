package Method_or_function2;

public class Calculator {

    public void Addition() {

        int a=65;
        int b=85;

        int sum=a+b;
        System.out.println("Addition of a and b is "+sum);
    }

    public void Substraction() {

        int c=89;
        int d=57;

        int sum=c-d;
        System.out.println("Substraction of c and dis "+sum);
    }

    public void Multiplication() {

        int e=54;
        int f=56;

        int sum=e*f;
        System.out.println("Multiplication of e and f "+sum);
    }

    public void Devide() {

        int g=90;
        int h=5;

        int sum=g/h;
        System.out.println("Devide of g and h "+sum);
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();

        obj.Addition();
        obj.Substraction();
        obj.Multiplication();
        obj.Devide();
    }



    }

