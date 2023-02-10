package Java_create_classes;

public class Doctor_class {
    String name;
    String dept;
    int age;
    int salary;
    public Doctor_class(String name,String dept, int age, int salary){
        this.name = name;
        this.age = age;
        this.dept= dept;
        this.salary= salary;
    }
    public static void main(String [] args){
        Doctor_class obj1 = new Doctor_class("Dr. harjeet singh","surgen",25,35200);
        System.out.println("Doctor name is: "+obj1.name +", "+"Doctor age is: "+obj1.age+", "+"Doctor dept of: "+ obj1.dept+", "+"Doctor salary is: "+obj1.salary);
        Doctor_class obj2 = new Doctor_class ("Dr. aman", "medician ", 28,355522);
        System.out.println("Doctor name is: "+obj2.name +", "+"Doctor age is: "+obj2.age+", "+"Doctor dept of: "+ obj2.dept+", "+"Doctor salary is: "+obj2.salary);

    }
}
