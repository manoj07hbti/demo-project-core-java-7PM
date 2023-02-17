package method_or_function.method_or_function;

import java.util.Scanner;

public class calculator_App {

      public static void main(String args[]){

        System.out.println("Please enter value of a:");
        Scanner scannerobj =new Scanner(System.in);
        int a= scannerobj.nextInt();
        System.out.println("Please enter value of b:");
        int b=scannerobj.nextInt();
        calculator_App obj=new calculator_App();
               int result =  obj.add(a,b);
          System.out.println("Sum is:"+ result);


          System.out.println("Please enter value of k:");
          Scanner scannerobj1 = new Scanner(System.in);
          int k= scannerobj.nextInt();
          System.out.println("Please enter value of j:");
          int j =scannerobj.nextInt();
          calculator_App obj1=new calculator_App();
                int marks = obj.subtract(k,j);
          System.out.println("Sub is" + marks);

          System.out.println("Please enter value of o:");
          int o= scannerobj.nextInt();
          System.out.println("Please enter value of p:");
          int p =scannerobj.nextInt();
          calculator_App obj2=new calculator_App();
            int mark = obj.multiply(o,p);
            System.out.println("multi is " + mark);













      }

    public int add(int a,int b){

        int sum = a+b;

        return sum;
    }

    public int subtract(int k,int j){

        int sub = k-j;

        return sub;
    }

    public int multiply(int o,int p) {

        int multi = o * p;

        return multi;




    }










}
