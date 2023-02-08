package demo;

public class Collegeclass {
    String name="Govt college of law";
    String city="Banglore";
    String address="9Th cross main city Banglore";
    String Speciality="Law";
    int Establishment=1950;

    public static void main(String[] args) {
        Collegeclass obj1= new Collegeclass();
        System.out.println("Printing college name "+obj1.name);
        System.out.println("Printing college city "+obj1.city);
        System.out.println("Printing college address "+obj1.address);
        System.out.println("Printing college speciality "+obj1.Speciality);
        System.out.println("Printing college Establishment "+obj1.Establishment);
    }
}
