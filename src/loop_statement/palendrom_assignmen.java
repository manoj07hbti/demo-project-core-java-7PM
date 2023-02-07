package loop_statement;

public class palendrom_assignmen {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int N= 1232;
        int A=N;
        int P= 0;
        System.out.println();
        while (N!=0){
            P = P*10 + (N%10);
            N= N/10;
        }
        System.out.println("reverse number : " +P);
        if (P==A){
            System.out.println(P +" is palendrome number of " +A);
        }
        else {
            System.out.println(P +" is not palendrome number of " +A);
        }
    }
}
