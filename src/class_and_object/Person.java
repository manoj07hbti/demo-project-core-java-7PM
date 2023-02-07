package class_and_object;

public class Person {

   String name="Raj";
   int age=21;
   String city="Jaipur";

    public static void main(String[] args) {
        //SYNTAX : ClassName objName= new ClassName();
        Person obj1= new Person();

        System.out.println("Printing person name "+obj1.name);
        System.out.println("Printing person Age "+obj1.age);
        System.out.println("Printing person City "+obj1.city);

    }
}
