package variable;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class DemoVariable {

    public static void main(String[] args) {

     //SYNTAX :  DataType varName;  // variable declaration

        String cityName; // we have declared a  String variable with cityName!
    //SYNTAX: varName=Value ;// assignment

        cityName="Agra"; // String values are always should be in ""

        System.out.println(cityName);
        System.out.println("CITY: "+cityName);

        int age; // we have declared a variable with age name
        age=23; // we have assigned 23 value to age variable

        System.out.println(age);
        System.out.println("AGE: "+age);

        double price; // we have declared a double variable with name price
        price=322.67; // we have assigned value to price variable

        System.out.println(price);
        System.out.println("PRICE: "+price);

        String length;
        length="5.5 inches";

        System.out.println("Length is : "+length);

        String Industry;
        //syntax:varName = value;
        Industry="ibm";
        System.out.println("INDUSTRY "  + Industry);

        String dob;

        dob="20/07/1990";
        System.out.println("Date of Birth is :"+dob);

    }
}
