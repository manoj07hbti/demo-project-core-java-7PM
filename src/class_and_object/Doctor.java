package class_and_object;

public class Doctor {
    // doctor properties are : name, age, degree, city
    String name= "Raju";
    int age = 43;
    String degree = "MBBS";
    String city = "Agra";

    public static void main(String[] args) {
        Doctor obj1= new Doctor();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object1 name : "+obj1.name);
        System.out.println("Printing object1 age :"+obj1.age);
        System.out.println("Printing object1 degree :"+obj1.degree);
        System.out.println("Printing object1 city :"+obj1.city);

        Doctor obj2= new Doctor();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object2 name :"+obj2.name);
        System.out.println("Printing object2 age :"+obj2.age);
        System.out.println("Printing object2 degree :"+obj2.degree);
        System.out.println("Printing object2 city :"+obj2.city);

        Doctor obj3= new Doctor();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object3 name :"+obj3.name);
        System.out.println("Printing object3 age :"+obj3.age);
        System.out.println("Printing object3 degree :"+obj3.degree);
        System.out.println("Printing object3 city :"+obj3.city);

    }

}
