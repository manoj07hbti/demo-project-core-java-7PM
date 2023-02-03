package loop_working;

public class Factorial_Of7 {
    public static void main(String[] args) {
        int fact=1;
        for (int i=7; i>0; i--){
            fact=fact*i; //1*7=7*6*5*4*3*2*1
        }
        System.out.println(fact + "i");
    }
}
