package ScannerMethod;

import java.util.Scanner;
public class NewClassScanner {
    public int add(int a, int b){

        int sum=a+b;
        return sum;
        }
        public int sub(int a, int b){
        int sub= a-b;
        return sub;
        }
        public int multi(int a, int b){
        int multi=a*b;
        return multi;
        }
        public double divide(int a, int b){
        double divide= (double)a/b;
        return divide;
        }

        public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a =obj.nextInt();
        System.out.println("Enter the value of b ");
        int b= obj.nextInt();
        System.out.println("Enter your choice : press 1 for add, press 2 for sub, press 3 for multi, press 4 for divide");
        int choice = obj.nextInt();

        NewClassScanner Obj= new NewClassScanner();
        if(choice==1){
            int result=Obj.add(a,b);
            System.out.println("Sum is :"+ result);
        } else if (choice==2) {
            int result= Obj.sub(a,b);
            System.out.println("sub of "+ result);
        } else if (choice==3){
            int result= Obj.multi(a,b);
            System.out.println("multi is "+result);
        } else if (choice==4){
            double result= Obj.divide(a,b);
            System.out.println("divide a to b is :"+ result);
        }

        }







}
