package class_and_object;

public class Doctor1 {
//    pesonalized constructor
    String name;
    int age;
    String degree;
    String city;

    public Doctor1(String name, int age, String degree, String city) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.city = city;
    }
//    pesonalized constructor
public static void main(String[] args) {
    Doctor1 obj1 = new Doctor1("Raj", 21, "MBBS", "Delhi");
    Doctor1 obj2 = new Doctor1("Manish", 25, "B.pharma", "Agra");
    System.out.println("Name : " +obj1.name + " , Age : " +obj1.age + " , degree : " +obj1.degree  +" , city : " +obj1.city );
    System.out.println("Name : " +obj2.name + " , Age : " +obj2.age + " , degree : " +obj2.degree  +" , city : " +obj2.city );
}
}
