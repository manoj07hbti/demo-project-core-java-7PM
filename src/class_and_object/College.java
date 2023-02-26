package class_and_object;

public class College {

    String Category = "Boys";
    String Name = "DPS";
    int Student_no = 1500;

    public static void main(String[] args) {

        College obj1 = new College();
        System.out.println("Category obj1 " +obj1.Category);
        System.out.println("Name obj1 " +obj1.Name);
        System.out.println("Student No. obj1 " +obj1.Student_no);

        College obj2 = new College();
        System.out.println("Category obj2 " +obj2.Category);
        System.out.println("Name obj2 " +obj2.Name);
        System.out.println("Student No. obj2 " +obj2.Student_no);
    }

}
