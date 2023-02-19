package method_or_function;

import demo.Demo;

import java.util.Scanner;

public class DemoATM {

    public void checkpin(int pin){
        if (pin==1234){
        System.out.println("Welcome to ATM");
    }
    else {
    System.out.println("enter wrong pin");
    }}

    public static void main(String[] args) {
        System.out.println("please enter your pin :");
        Scanner scannerobj=new Scanner(System.in);
        int pin=scannerobj.nextInt();
        DemoATM obj=new DemoATM();
        obj.checkpin(pin);
    }
}
