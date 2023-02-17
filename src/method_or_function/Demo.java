package method_or_function;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Demo {

    public void makecube(int Number){

        int cube=Number*Number*Number;
        System.out.println("number of cube is : " +cube);
    }
    public void voting(int age, String city) {
        if (age >=18 & city== "Agra") {
            System.out.println("person is eligibe for voting in agra :");
        } else {
            System.out.println("person is not eligible for voting in agra");
        }
    }

    public void calculator(int a, int b){

        int sum=a+b;
        System.out.println("sum is : " +sum);
    }
        public static void main (String[]args){
            Demo obj = new Demo();
            obj.makecube(5);
            obj.voting(19,"Agra");
            obj.voting(17,"goa");
            obj.calculator(25,25);

        }
    }
