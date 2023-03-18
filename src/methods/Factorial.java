package methods;

public class Factorial {
    public void fact(int number){
        int result=1,i;
        for(i=number;i>0;i--){
            result = result*i;
        }
        System.out.println("Factoaril of "+number+" is "+result);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.fact(5);
    }
}
