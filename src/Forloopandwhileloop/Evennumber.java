package Forloopandwhileloop;

public class Evennumber {
    public static void main(String[] args) {
        int number=100;
        System.out.println("even number 1 to"+number+"are:");
        for (int i=1; i<=number;i++){
            if(i % 2 ==0){
                System.out.println(i+"");
            }
        }
    }
}