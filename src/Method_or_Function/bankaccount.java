package Method_or_Function;
import java.util.Scanner;

public class bankaccount {
    public void bank(int amount){
        if (amount>=5000) {
            System.out.println("Your Account is create with Bank");
        }
            else{
                System.out.println("Your account cannot be created due less amount");
            }
        }


    public static void main(String[] args) {
        System.out.println("Enter ammount : ");
        Scanner sc= new Scanner(System.in);
        int amount = sc.nextInt();
        bankaccount obj1 = new bankaccount();
        obj1.bank(amount);
    }
}
