package exception_handling;

public class Demo_Calculator {

    public int divide (int a, int b) {

        int result=0;

        try {
            result = a / b;
        }
        catch (Exception e) {
            System.out.println("Handling Exception Occurred : " +e);
        }
        finally {
           System.out.println("This IS A Finally Block ");
        }

        return result;
    }


    public static void main (String []ar){

        Demo_Calculator obj = new Demo_Calculator();


         int result=obj.divide(6,0);

        System.out.println("Divide  IS : "+result);

      result=obj.divide(4,0);

      System.out.println("Divide Is Zero  ,.,.,., "+result);



    }



}
