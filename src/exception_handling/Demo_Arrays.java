package exception_handling;

public class Demo_Arrays {

    public void arry(){

        int arr[]={21,34,65,43,76,56,21,43};

        System.out.println("Printing Element At Index : 1 "+arr[0]);

        System.out.println("Printing Element At Index : 2 "+arr[1]);

        System.out.println("Printing Element At Index : 3 "+arr[2]);

        try {
            System.out.println("Printing Element At Index : 4 " + arr[10]);
        }
          catch (Exception e){
           System.out.println("Exception Occurred : "+e);
        }
        finally {
            System.out.println("This IS A Finally Block  executes");
        }
        System.out.println("Printing Element At Index : 5 "+arr[4]);

        System.out.println("Printing Element At Index : 6 "+arr[5]);

        System.out.println("Printing Element At Index : 7 "+arr[6]);


            System.out.println("Printing Element At Index : 8 " + arr[7]);


        }


    public static void main(String[]args){

        Demo_Arrays obj = new Demo_Arrays();



        obj.arry();




    }










}
