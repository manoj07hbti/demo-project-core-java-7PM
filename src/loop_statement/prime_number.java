package loop_statement;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Prime numbers : ");
        int i;
        int N = 100;
        int x;
        boolean flag= true;
        //check for every number from 1 to N
        for (i = 2; i <= N; i++) {
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag) {
                System.out.print(i +" ");
            } else {
                System.out.print("");
            }
        }
    }
}

