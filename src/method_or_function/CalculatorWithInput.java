package method_or_function;

public class CalculatorWithInput {

    public void add(int a, int b){

        int sum=a+b;

        System.out.println("Addition is : "+sum);
    }

    public void multi(int a, int b){

        int multi= a*b;

        System.out.println("Multiplication is : "+multi);

    }

    public static void main(String[] args) {

        CalculatorWithInput obj= new CalculatorWithInput();

        obj.add(34,78);
        obj.add(12,33);

        obj.multi(3,6);
        obj.multi(23,4);
    }
}
