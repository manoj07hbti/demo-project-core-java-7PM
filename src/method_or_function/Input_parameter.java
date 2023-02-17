package method_or_function;

public class Input_parameter {
    public void checkprime(int number){
        if (number %2==0){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args) {

        Input_parameter obj=new Input_parameter();

        obj.checkprime(11);

    }
}
