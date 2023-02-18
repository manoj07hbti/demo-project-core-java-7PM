package method_or_function;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Demo {

    public void cube(int number) {

        int cube = number * number * number;
        System.out.println("cube is : " + cube);
    }

    public void voting(int age, String city) {

        if (age > 19 & city == "agra") {

            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    public void multi(int a, int b) {

        int multi = a * b;
        System.out.println("multi is : " + multi);
    }

    public void even(int number) {

        if (number % 2 == 0) {
        System.out.println("even number : " + number);
        }
        else {
            System.out.println("odd number : " + number);
        }}
    public static void main(String[] args) {
        Demo obj=new Demo() {
        };

        obj.cube(5);
        obj.voting(20,"agra");
        obj.multi(5,8);
        obj.even(97);


        }}
