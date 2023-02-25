package loops_working;

public class PrimeNumber {
    public static void main(String[] args) {


        int number = 15;

        boolean flag = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                flag = false;
            }


        }
        if (flag) {

            System.out.println("This is prime no...... " + number);
        } else {

            System.out.println("This is not prime no........ " + number);
        }
    }
}
