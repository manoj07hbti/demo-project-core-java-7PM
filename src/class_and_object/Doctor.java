package class_and_object;

import javax.naming.Name;

public class Doctor {

    String Name="dr.Dhirendra Singh";
    String Adress="Sadar Bazar";
    int Age=45;
    double Fee=500.00;

    public static void main(String[] args) {

        Doctor obj1= new Doctor();
        System.out.println("Name is : " + obj1.Name);
        System.out.println("Age is : " +obj1.Age);
        System.out.println("Adress is : " +obj1.Adress);
        System.out.println("Fee is : " +obj1.Fee);
        }




    }

