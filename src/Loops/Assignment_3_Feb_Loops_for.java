package Loops;

public class Assignment_3_Feb_Loops_for {
    public static void main(String[] args) {
        //Assignment//
        //1.Print table of 5 with the help of loops//
        //SYNTAX: for(initialization, condition, decrement){
        //  block of statement}
        int number;
        number=5;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"="+number*i);
        }

        //2.Find the Factorial of 7//
        //factorial of 7 is :7*6*5*4*3*2*1=5040//

         int fact=1;
        for (int i=1; i<=7; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of 7 is "+fact);


    }
}
