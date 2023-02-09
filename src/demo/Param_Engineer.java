package demo;

public class Param_Engineer {
    String name;
    int age;
    String dept;

    public Param_Engineer(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {
        Param_Engineer obj1= new Param_Engineer("Yash Sawant",27,"Civil");
        System.out.println("Name is: "+obj1.name + " Age is: "+obj1.age +" Dept is: "+obj1.dept);

        Param_Engineer obj2= new Param_Engineer("Priya rawat",26,"Computer");
        System.out.println("Name is: "+obj2.name + " Age is: "+obj2.age +" Dept is: "+obj2.dept);
    }
}
