package loops_working;


public class DemoDoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX :
       /* do
        {
            //statements
        } while (condition);*/

       int i=0;
       do{
           System.out.println("This is do while loop demo: "+i);
           i++;
       }while (i<5);


       int j=10;

       do
           {
               System.out.println("Decrement do while loop : "+j);
               j--;
           } while (j>0);


    }
}
