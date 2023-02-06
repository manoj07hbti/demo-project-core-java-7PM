package loops_working;

public class DemoBreakContinue {

    public static void main(String[] args) {


        for (int i=0; i <10 ; i++){

            System.out.println("This is loop  "+i);
            if(i==3){
                break;
            }


        }


        for(int i=0; i<10; i++){

            if(i==4){
                continue;
            }
            System.out.println("This is my code at iteration:  "+i);
        }


    }
}
