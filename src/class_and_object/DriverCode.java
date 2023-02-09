package class_and_object;

public class DriverCode {

    public static void main(String[] args) {

        //SYNTAX : CLassName objName= new ClassName(param1,2,.....);

        Book book= new Book();

        System.out.println("Book Name: "+book.name + " writer: "+book.writeName);

        Doctor doctor= new Doctor("Raj",32,"Dental");

        Person person= new Person();

        Student student= new Student("Mohit",1,"IT");

    }
}
