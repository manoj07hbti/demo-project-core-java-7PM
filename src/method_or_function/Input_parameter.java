package method_or_function;

public class Input_parameter {
    public void primenumber(int number){

        boolean flag=true;
        for (int i=2; i<number; i++);
        if (number%2==0){
            System.out.println("number is prime : " +number);
        }
        else {
            System.out.println("number is not prime : " +number) ;
        }
    }
    public void factorial(int fact){
        for (int i=fact; i>0; i--){
           System.out.println("factorial is : " +i);
        }
    }
    public void percentage(int number, int ratio){
        double per=number*ratio/100;
        System.out.println("answer is : " +per);
    }

    public static void main(String[] args) {
        Input_parameter obj = new Input_parameter();

        obj.primenumber(6);
        obj.factorial(20);
        obj.percentage(80,10);
    }}