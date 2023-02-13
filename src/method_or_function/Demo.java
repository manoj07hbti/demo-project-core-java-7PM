package method_or_function;

public class Demo {

    public void square() {

        int number = 3;

        int square = number * number;


        System.out.println("square of 3 is : " + square);}

    public void even()
    {

        for (int i=1; i<=50; i++)
            if (i%2==0)


                System.out.println("even number is : " +i);
    }

    public static void main(String[] args) {

        Demo obj=new Demo();

        obj.square();
        obj.even();
    }

}