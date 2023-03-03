package exception_handling;

public class DemoArray {

    public static void main(String args[]){

        DemoArray obj = new DemoArray();

          obj.d1();








    }

    public void d1(){

        int Arr []={21,65,19,33,11,};

        System.out.println("Printing element  at index" + Arr [0] );

        System.out.println("Printing element at index" + Arr [3] );
        try {
            System.out.println("Printing element at index" + Arr[5]);
        }
        catch(Exception e){
            System.out.println("Exception occurred :" + e);
        }
        finally{
            System.out.println("this is finally block it will always executed");
        }
        System.out.println("Printing element at index" + Arr [1] );

        System.out.println("Printing element at index" + Arr [2] );
    }




}
