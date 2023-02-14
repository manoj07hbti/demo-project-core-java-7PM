package Method_obje;

public class MethodDay3 {
    //write a method to check number is prime or not

    public void primeNumber(int number){

        if(number%2==0){
            System.out.println("this is prime number");
        }
        else{
            System.out.println("this is not prime number");
        }
    }
    //Q-2 write a method to provide factorial
    public void facto(int fact){
        System.out.println("this is factorial of "+fact);
        for(int i=fact; i>0; i--){

                System.out.println(i);

        }
    }
    //Q-3 calculate percentage
    public void percentage(int number, int ratio){
        double a= (double)(number*ratio)/100;
        System.out.println(a);
    }
    public static void main(String [] args){
        MethodDay3 obj= new MethodDay3();
        obj.primeNumber(26);
        obj.facto(5);
        obj.percentage(1500,5);
    }
}
