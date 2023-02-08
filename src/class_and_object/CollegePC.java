package class_and_object;

public class CollegePC {
    String name;
    String city;
    int stN;
    int teaN;

    public CollegePC(String name, String city, int stN, int teaN) {
        this.name = name;
        this.city = city;
        this.stN = stN;
        this.teaN = teaN;
    }

    public static void main(String[] args) {
        CollegePC obj1 = new CollegePC("AEC", "Agra", 5000, 200);
        CollegePC obj2 = new CollegePC("NIT Delhi", "Delhi", 6000, 250);
        System.out.println("Name : " +obj1.name +" , City : " +obj1.city +" , Student number : " +obj1.stN +" , Teacher number : " +obj1.teaN);
        System.out.println("Name : " +obj2.name +" , City : " +obj2.city +" , Student number : " +obj2.stN +" , Teacher number : " +obj2.teaN);
    }
}
