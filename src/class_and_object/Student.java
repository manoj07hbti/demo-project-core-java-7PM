package class_and_object;

public class Student {

    String name;
    int roll_no;
    String section;

    //parameterized constructor

    public Student(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Jatin",20,"IT");
        System.out.println("Name: "+student1.name + " Roll No: "+student1.roll_no +" Section : "+student1.section);

        Student student2= new Student("Rahul",21,"CS");

        System.out.println("Name: "+student2.name + " Roll No: "+student2.roll_no +" Section : "+student2.section);

    }

}
