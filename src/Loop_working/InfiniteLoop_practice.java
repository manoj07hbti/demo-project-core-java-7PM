package Loop_working;

public class InfiniteLoop_practice {

    public static void main(String[] args) {
        {


            for (int i=1 ; i>0; i++ ){

                System.out.println("This my loop :"+i);
            }

            int i=1;

            while(i>0){

                System.out.println("This is while loop : "+i);
                i++;
            }
            i=1;
            do {

                System.out.println("This is do while : "+i);
                i++;
            } while (i>0);

        }
    }
}
