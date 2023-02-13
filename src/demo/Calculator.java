package demo;

public class Calculator {
    public void add() {
        int a = 6;
        int b = 3;

        int sum = a + b;
        System.out.println("Addition of a and b is : " + sum);
    }
    public void sub(){
        int a = 6;
        int b = 3;
        int sum =a - b;
        System.out.println("Subtraction is a and b :" + sum);
    }
    public void multiply(){
        int a = 6;
        int b = 3;
        int sum = a * b;
        System.out.println("Multiplication of a and b is " + sum);
    }
    public void divide(){
        int a = 6;
        int b = 3;
        int sum = a/b;
        System.out.println("Division of a and b is " + sum);
    }
    public void cube(){
        int a = 5;
        int sum = a*a*a;
        System.out.println("Cube of a is " + sum);
    }
        public static void main(String[] args){
            Calculator obj=new Calculator();
            obj.add();
            obj.sub();
            obj.multiply();
            obj.divide();
            obj.cube();
        }
    }


