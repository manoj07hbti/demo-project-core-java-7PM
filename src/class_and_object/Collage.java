package class_and_object;

public class Collage {

    String name="Agra Collage";
    String city="Agra";
    int timing=10;
    double fee=10000.00;

    public static void main(String[] args) {
        Collage obj1=new Collage();
        System.out.println("Name is : " +obj1.name);
        System.out.println("City is : " +obj1.city);
        System.out.println("Timing is : " +obj1.timing);
        System.out.println("fee is : " +obj1.fee);
    }
}
