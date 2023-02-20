package method_or_function;

import java.util.Scanner;

public class DemoAtm {
    public void checkPIN(int PIN){

        if(PIN==3322){
            System.out.println("welome to Canara Bank");

        }
        else{
            System.out.println("Incorrect pin , please try again");
        }
    }

    public static void main(String[] args) {
        System.out.println("please enter the pin :");
        Scanner Bankobj=new Scanner(System.in);
        int pin=Bankobj.nextInt();


        DemoAtm obj=new DemoAtm();
        obj.checkPIN(pin);

    }
}
