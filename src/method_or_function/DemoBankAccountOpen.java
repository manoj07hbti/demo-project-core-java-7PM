package method_or_function;

import java.util.Scanner;

public class DemoBankAccountOpen {

    public void openAccount(double amount) {


        if (amount >= 5000) {

            System.out.println("Account is open successfully");
        }
        else {

            System.out.println("Account is not open successfully. You need to min. balance 5000 to open account");
        }
    }

    public static void main(String[] args) {

        double repeat = 0;

        while (repeat == 0) {

            System.out.println("Enter an Amount");
            Scanner scannerObj = new Scanner(System.in);
            double amount = scannerObj.nextDouble();

            DemoBankAccountOpen obj = new DemoBankAccountOpen();
            obj.openAccount(amount);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 0 for repeat. Press any number for exit");
            repeat = scanner.nextDouble();


        }
    }
}
