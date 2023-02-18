package method_or_function;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Demo {
    public String  welcome(String name){
        String massage="welcome : " +name;
        return massage;
    }
    public int  makecube(int number){
        int cube=number*number*number;
        return cube;
    }

    public double percentage(int number ,int ratio){
        double per=(double) (number*ratio)/100;
        return per;
    }

    public static void main(String[] args) {

        Demo obj=new Demo();
        String output= obj.welcome("Shekhar");
        System.out.println(output);
    int result= obj.makecube(6);
    System.out.println("cube is : " +result);
    double Result= obj.percentage(80,6);
    System.out.println("per is : " +Result);
    }
}
