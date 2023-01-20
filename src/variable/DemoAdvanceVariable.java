package variable;

public class DemoAdvanceVariable {

    public static void main(String[] args) {

        //SYNTAX:  DataType varName= value;

        String name="Raj";

        System.out.println("Name is : "+name);

        name="Mukesh"; // reuse of variable

        System.out.println("after reuse Name is : "+name);

        int a=7;
        int b=23;

        int sum= a+b;
        System.out.println("Addition is "+sum);

       int multi= a*b;
       System.out.println("Multi of a and b is  :"+multi);

       double divide=(double) a/b;
       System.out.println("Divide is : "+divide);

       int remainder =b%a;
       System.out.println("Remainder is : "+remainder);

       a+=b; // a=a+b

       System.out.println(" a : "+a);

       int i=1;
       i++;// i=i+1=1+1=2
       System.out.println("Increment of i: "+i);

       int j=2;
       j--;// j= j-1=2-1=1

       System.out.println("Decrement of j is : "+j);

    }
}
