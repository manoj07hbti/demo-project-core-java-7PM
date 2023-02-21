package loops_working;

public class DemoForLoop {
    public static void main(String[] args) {

        // SYNTAX : for(initialization, condition, increment/decrement){
        //                  //block of statement
        //          }

        for (int i = 1; i <= 10; i++) {

            System.out.println("Hello......." + i);


        }

        for (int i=10; i >= 0 ; i--){

            System.out.println("Decrement......."+ i);
        }
    }
}
