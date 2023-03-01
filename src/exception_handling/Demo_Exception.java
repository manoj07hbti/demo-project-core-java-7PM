package exception_handling;

public class Demo_Exception {

    public int divide (int a, int b) {

        int result=0;

        try {
            result = a / b;
        }
        catch (Exception e) {
            System.out.println("Handling Exception" +e);
        }

        return result;
    }


    public static void main (String []ar){

        Demo_Exception obj = new Demo_Exception();


         int result=obj.divide(6,3);

        System.out.println("Divide  IS : "+result);

      result=obj.divide(4,0);

        System.out.println("Divide Is ,.,.,., "+result);



    }



}
