package class_and_object.parameterzied_constructor;

public class Doctor {

    // data member

    String name;
    int age;
    String dept;

    // Parameterized Constructor


    public Doctor(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {

        // SYNTAX:- ClassName objName = new ClassName(param...1, param...2, param...3);

        Doctor obj1 = new Doctor("Raj",34,"Dental");
        System.out.println("Name:- " +obj1.name + ", Age:- " +obj1.age + ", Dept.:- " +obj1.dept);

        Doctor Dr = new Doctor("Rohit",43,"Heart");
        System.out.println("Name:- " +Dr.name + ", Age:- " +Dr.age + ", Dept.:- " +Dr.dept);

        Doctor Dr1 = new Doctor("Aman",32,"Surgeon");
        System.out.println("Name:- " +Dr1.name + ", Age:- " +Dr1.age + ", Dept.:- " +Dr1.dept);
    }
}
