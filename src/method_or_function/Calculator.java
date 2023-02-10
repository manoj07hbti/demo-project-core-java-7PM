package method_or_function;

public class Calculator {

    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void add(){

        int a=3;
        int b=8;

        int sum=a+b;

        System.out.println("Addition on a and b is : "+sum);
    }

    // subtract a-b


    public void divide(){

        int a=56;
        int b=3;

        double divide= (double) a/b;

        System.out.println("Division is : "+divide);
    }

    //multi  a*b

    public static void main(String[] args) {
        Calculator obj= new Calculator();

        obj.add();

        obj.divide();

    }

}
