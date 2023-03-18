package loop;

public class OddNumber {
    public static void main(String[] args) {
        int number=100,i=1;
        while(i<=number){
            if(i%2!=0){
                System.out.println("Odd Number "+i);
            }
            i++;
        }
    }
}
