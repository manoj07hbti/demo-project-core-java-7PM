package class_and_object;

import java.sql.SQLOutput;

public class Myself {


    String name;
    String city;
    int age;


    public Myself(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public static void main(String[] args) {

        Myself obj1= new Myself("Shekhar","Agra",27);
        System.out.println("name is : " +obj1.name +  "Age is : " +obj1.age + "City is : "+obj1.city);

        Myself obj2=new Myself("Shubham","Tundla",18);
        System.out.println("name is : " +obj2.name + "city is : " +obj2.city + "age is : " +obj2.age);

    }
}
