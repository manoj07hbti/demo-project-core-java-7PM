package class_and_object;

public class Building {

    String Type = "Hotel";
    int rooms = 54;

    public static void main(String[] args) {

        Building obj1 = new Building();
        System.out.println(obj1.Type);
        System.out.println(obj1.rooms);

        Building obj2 = new Building();
        System.out.println(obj2.Type);
        System.out.println(obj2.rooms);
    }
}
