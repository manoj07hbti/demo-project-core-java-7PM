package Loop_working;

public class WhileLoop_practice {

    public static void main(String[] args) {
      //SYNTAX :
        /* while(condition){
                         //looping statements
                         increment/decrement
                }
          */

        int i=2;
        while(i<=10){
            System.out.println("while loop increment " +i);
            i++;
        }


        int j=12;
        while(j>=10){
            System.out.println("Decrement in while loop "+j);
            j--;
        }


    }
}
