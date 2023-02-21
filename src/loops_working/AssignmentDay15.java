package loops_working;

public class AssignmentDay15 {
    public static void main(String[] args) {



        int Number = 100, i = 1;
        while (i < Number) {
            if (i % 2 == 0) {
                System.out.println("even number:- " + i);
            }
            i++;
        }


        for (int j = 1; j < 100; j++) {
            if (j % 2 == 0) {
                System.out.println("even:- " + j);
            }
        }


        int number = 100, k = 1;
        while (k < number) {
            if (k % 2 != 0) {
                System.out.println("Odd. number:- " + k);
            }
            k++;
        }


        number =  1;
        boolean prime = true;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("Number is a prime number :- " + number);
        } else {
            System.out.println("Number is not a prime number :- " + number);
        }



    }
}