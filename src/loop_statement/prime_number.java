package loop_statement;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Prime number : ");
        int i;
        int N= 50;
        int x;
        //check for every number from 1 to N
        for(i=2; i<=N; i++){
            for (x=2; x<=N; x++){
                if (i/x==0){
                    System.out.println("prime number is : "+i);
                }
            }
        }
    }
}
