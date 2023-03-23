package Method_obje;

public class Calculator {
    // Assignment of 10 feb

    // method of Calculator Addition, subtract, multiply, and divided,
    // this is addition method
    public void Addition(){
        int a=6;
        int b=9;
        int sum= a+b;
        System.out.println(sum);
    }
    // this is subtract method
    public void Subtract(){
        int a=55;
        int b=69;
        int Subtract= b-a;
        System.out.println(Subtract);
    }
    // this is multiply method
    public void multiply(){
        int a=25;
        int b=35;
        int multiply= a*b;
        System.out.println(multiply);
    }
    // this is divided method
    public void divided(){
        int a=38;
        int b=26;
        double divided= (double) a/b;
        System.out.println(divided);
    }
    // create a method which will make cube of given number
    public void cube(){
        int number= 6;
        int cube = number*number*number;
        System.out.println("this is cube of 6 number= "+cube);
    }
    // create a method print odd number between 1 to 100
    public void oddNumber(){

        for(int i=1; i<=100; i++){
            if(i%2 !=0){
                System.out.println("this is odd number "+i);
            }

        }
    }
    //create a method to find whether a person is eligible for voting in Agra or not
    public void voting(){
        int age=15;
        String City= "Agra";
        if(age>=18 & City=="Agra") {
            System.out.println("this person eligible for voting ");
        }
        else {
            System.out.println("this person is not eligible for voting");
        }
    }
    public static void main(String [] args){

        Calculator obj= new Calculator();

        obj.Addition();        obj.Subtract();        obj.multiply();        obj.divided();
        obj.cube();        obj.oddNumber();        obj.voting();
    }
}
