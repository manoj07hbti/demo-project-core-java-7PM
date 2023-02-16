package Method_obje;

public class MethodDay3 {
    //write a method to check number is prime or not

    public void primeNumber( int n) {
        int i;
        int m=0;
        int flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+"is not prime number");
        }
        else{
            for(i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n+"is not prime number");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(n+"is prime number");
            }
        }
    }



    //Q-2 write a method to provide factorial
    public void facto(int fact, int multi){
        System.out.println("this is factorial of "+fact);
        for(int i=fact; i>0; i--){
            // how to sum all factorial number
            multi *=i;

                System.out.print(" "+i);


        }System.out.println("=="+multi);
    }

    //Q-3 calculate percentage
    public void percentage(int number, int ratio){
        double a= (double)(number*ratio)/100;
        System.out.println(a);
    }
    public static void main(String [] args){
        MethodDay3 obj= new MethodDay3();
        obj.primeNumber(23);
        obj.facto(5,1);
        obj.percentage(1500,5);
    }
}
