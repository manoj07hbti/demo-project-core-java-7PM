package method_or_function;

public class Calculator_Assign {

    //calculator with Subtract and Multiply

    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void Subtract(){
        int a=55;
        int b=30;
        int Subtract=a-b;
        System.out.println(" Subtract of A & B is " +Subtract);
    }

    public void Multiply(){
        int a=18;
        int b=22;
        int Multiply=a*b;
        System.out.println("Multiply of given Number is: " + Multiply);
    }
    public static void main(String[] args) {
        Calculator_Assign obj=new Calculator_Assign();
        obj.Subtract();
        obj.Multiply();

}
}
