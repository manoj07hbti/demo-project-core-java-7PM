package Method_or_Function;

public class calculatorinputmethod {
    public void add(int a, int b){
        int sum;
        sum = a+ b;
        System.out.println("Addition of two number : " +sum);

    }
    public void sub(int a, int b){
        int sub;
        sub = a- b;
        System.out.println("substration of two number : " +sub);
    }
    public void divide(int a, int b){
        double div;
        div = (double) a/b;
        System.out.println("divide of two number : " +div);
    }    public void multiply(int a, int b){
        double multiply;
        multiply = (double) a*b;
        System.out.println("multiplication of two number : " +multiply);
    }
    public static void main(String[] args) {
        calculatorinputmethod addition = new calculatorinputmethod();
        addition.add(5,6);
        calculatorinputmethod substration = new calculatorinputmethod();
        substration.sub(7,9);
        calculatorinputmethod division = new calculatorinputmethod();
        division.divide(4,6);
        calculatorinputmethod multiplication = new calculatorinputmethod();
        multiplication.multiply(7,9);

    }
}

