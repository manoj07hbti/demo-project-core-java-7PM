package exception_handling;

public class Calculator {

    public int divide (int a, int b){

        int result=0;

        try {
             result = a / b;
        }
        catch (Exception e){

            System.out.println("Exception occurred "+e);
        }

        return result;

    }


    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int output= obj.divide(4,2);

        System.out.println("Divide is : "+output);

        output= obj.divide(3,0);

        System.out.println("Divide by zero is : "+output);

    }
}
