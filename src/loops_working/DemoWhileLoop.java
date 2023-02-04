package loops_working;

public class DemoWhileLoop {


    public static void main(String[] args) {

        //SYNTAX :
        /* while(condition){
                         //looping statements
                         increment/decrement
                }
          */

        int i=0;

        while (i<10){

            System.out.println("Demo Increment while loop : "+i);
            i++;
        }

        int j=5;

        while (j>0){

            System.out.println("Demo decrement while loop "+j);
            j--;
        }


    }
}
