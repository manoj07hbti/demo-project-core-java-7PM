package variable;

//This class shows how to define & assign the variables to carry of different
//Mathematical operations
public class AA_Advance_Variables {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        int multi = a * b;
        System.out.println("Multi of a and b is : " + multi);
        double divide = a / b;
        System.out.println("Divide is :" + divide);
        int remainder = b % a;
        System.out.println("remainder is;" + remainder);
        a += b;//a=a=b
        int i = 2;
        i++;
        System.out.println("Increment of i= " + i);
        int j = 2;
        j--;

        System.out.println("decrement of j= " + j);


        int x = 3;
        int s = x * x;
        System.out.println("Square" + s);
        int c = 5;
        int d = c * c * c;
        System.out.println("Cube" + d);
        int e = 120 * 10 / 100;
        System.out.println("Percentage" + e);


    }
}


