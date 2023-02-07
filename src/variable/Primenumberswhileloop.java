package variable;

public class Primenumberswhileloop {
    public static void main(String[] args) {

        for (int j = 2; j <= 50; j++) { //For loop to check Prime numbers from 1 to 50
            int q = 1, i, n, flag = 0; //q is quotient, n is number, i is remainder, flag is boolean
            n = j;
            q = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(q + " is not prime number");
            } else {
                for (i = 2; i <= q; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is a prime number");
                }
            }

        }
    }
}


