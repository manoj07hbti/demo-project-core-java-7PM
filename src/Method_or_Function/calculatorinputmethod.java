package Method_or_Function;

public class calculatorinputmethod {
    public int add(int a, int b){
        int sum;
        sum = a+ b;
        return sum;

    }
    public int sub(int a, int b){
        int sub;
        sub = a- b;
        return sub;
    }
    public double divide(int a, int b){
        double div;
        div = (double) a/b;
        return div;
    }
    public double multiply(int a, int b){
        double multipl;
        multipl = (double) a*b;
        return multipl;
    }
    public static void main(String[] args) {
        calculatorinputmethod addition = new calculatorinputmethod();
        int add= addition.add(5,6);
        System.out.println("Addition = "+add);
        calculatorinputmethod substration = new calculatorinputmethod();
        int sub = substration.sub(7,9);
        System.out.println("substraction = "+sub);
        calculatorinputmethod division = new calculatorinputmethod();
        double div = division.divide(4,6);
        System.out.println("division = "+div);
        calculatorinputmethod multiplication = new calculatorinputmethod();
        double multiply = multiplication.multiply(7,9);
        System.out.println("multiplication = " +multiply);

    }
}

