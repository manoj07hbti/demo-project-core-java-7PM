package method_or_function.method_or_function;

public class Method_oddNumber {

    public void  PrintOddNumber(){

        for(int i=1; i<=100;i++){

            if(i%2==0){

            System.out.println("Odd number is"+i);
            }
        }
    }
     public static void main(String args[]){

         // SYNTAX className objectName = new className();

         Method_oddNumber obj=new Method_oddNumber();

         obj.PrintOddNumber();


     }



}
