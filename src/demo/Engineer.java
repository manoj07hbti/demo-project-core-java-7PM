package demo;

public class Engineer {
    String name="Preeti Goyal";
    int age=25;
    String city="Jaipur";
    String Speciality="Computer engineer";

    public static void main(String[] args) {
        Engineer obj1= new Engineer();
        System.out.println("Printing person name "+obj1.name);
        System.out.println("Printing person age "+obj1.age);
        System.out.println("printing person city "+obj1.city);
        System.out.println("Printing person speciality "+obj1.Speciality);
    }
}
