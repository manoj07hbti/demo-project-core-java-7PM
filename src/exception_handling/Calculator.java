package exception_handling;

public class Calculator {

    public static void main(String args[]){

        Calculator obj= new Calculator();

        int output = obj. divide(124,3);

        System.out.println("divide is "  +  output);

        output =obj.divide(3,0);

        System.out.println("divide by zero " + output);




    }

    public int divide(int a,int b){

        int result =0;

        try {
             result = a / b;
        }
        catch(Exception e) {

            System.out.println("exception occurred" + e);
        }
        finally {

            System.out.println("this is finally block it will always executes");
        }
       return result;
    }



}
