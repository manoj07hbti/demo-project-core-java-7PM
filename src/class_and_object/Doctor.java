package class_and_object;

public class Doctor {

    // Syntax : Properties

    String Gender = "Male";
    String Department = "Surgeon";
    String Name = "Dr. Ram Kumar";
    int age = 45;

    public static void main(String[] args) {

        // SYNTAX : ClassName objectName = new ClassName();

        Doctor obj1 = new Doctor();
        System.out.println("Dr. Gender obj1 " +obj1.Gender);
        System.out.println("Dr. Department obj1 " +obj1.Department);
        System.out.println("Dr. Name obj1 " +obj1.Name);

        Doctor obj2 = new Doctor();
        System.out.println("Dr. Gender obj2 " +obj2.Gender);
        System.out.println("Dr. Department obj2 " +obj2.Department);
        System.out.println("Dr. Name obj2 " +obj2.Name);
    }
}
