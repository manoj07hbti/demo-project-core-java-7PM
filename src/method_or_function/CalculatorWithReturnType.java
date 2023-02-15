package method_or_function;

public class CalculatorWithReturnType {

    public int add(int a, int b){

        int sum=a+b;

        return sum;

    }


// subtract , multi and divide




    public static void main(String[] args) {

        CalculatorWithReturnType obj= new CalculatorWithReturnType();

       int sum= obj.add(3,7);

        System.out.println("Sum is "+sum);


    }
}
