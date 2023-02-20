package Method_obje;
import java.util.*;
public class ATM_machine {
    public void checkpin(int pin){

        if (pin==2525){

            System.out.println("Welcome to ATM process");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. chenge pin");
            System.out.println("4. check balance");

        }else {
            System.out.println("Incorrect pin please try again");
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter your PIN :");

        Scanner obj = new Scanner(System.in);
        int flag=0;
        while (flag==0) {
            int pin = obj.nextInt();
            int choice = obj.nextInt();
            ATM_machine Obj = new ATM_machine();
            Obj.checkpin(pin);
            if (choice == 1) {
                System.out.println("Case Deposit");
            } else if (choice == 2) {
                System.out.println("Case Withdrawal");
            } else if (choice == 3) {
                System.out.println("change your ATM pin");
            } else if (choice == 4) {
                System.out.println("check your balance");
            }

        }


    }


}
