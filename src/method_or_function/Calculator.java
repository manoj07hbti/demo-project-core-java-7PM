package method_or_function;

public class Calculator {

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void add(){

        int a = 54;
        int b = 876;
        int sum = a+b;

        System.out.println("Sum of " +a+ " and " +b+ " is :- " +sum);
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void sub(){

        int a = 65;
        int b = 75;
        int sub = a-b;

        System.out.println(b+ " Subtracted from " +a+" left :- " +sub );
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void multiply(){

        int a = 43;
        int b = 5;
        int multiply = a*b;

        System.out.println("Multiply of " +a+ " and " +b+ " is :- " +multiply);
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void divide(){

        int a = 4;
        int b = 12;
        double divide = (double) a/b;

        System.out.println(a+" divided by " +b+" gives :- " +divide);
    }

    public static void main(String[] args) {

        // ClassName objName = new ClassName();
        // objName.methodName();

        Calculator obj = new Calculator();

        obj.add();
        obj.sub();
        obj.multiply();
        obj.divide();
    }
}
