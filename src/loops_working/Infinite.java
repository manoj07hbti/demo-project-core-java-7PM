package loops_working;

public class Infinite {
    public static void main(String[] args) {


        for (int i = 1; i > 0; i++) {

            System.out.println("Infinite Time in for loop: " + i);
        }

        int i = 1;
        while (i > 0) {

            System.out.println("Infinite Time in while loop: " + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("Infinite Time in Do while loop: " + i);
            i++;
        } while (i > 0);


    }
}
