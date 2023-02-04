package variable;

public class Forloop {
    public static void main(String[] args) {
        int number=5;
        System.out.println("Printing Table of 5");
        for(int i=1; i<=10; i++){
            System.out.println(number+"x"+i+"="+number*i);
        }
        int fact=7;
        System.out.println("Printing Factorial of 7");
        for (int i = 1; i<7 ; i++) {
            System.out.println(fact=fact*i);
        }
    }
}
