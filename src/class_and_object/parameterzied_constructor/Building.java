package class_and_object.parameterzied_constructor;

public class Building {

    // data member

    String type;
    int floor;

    public Building(String type, int floor) {
        this.type = type;
        this.floor = floor;
    }

    public static void main(String[] args) {

        // SYNTAX: ClassName objName = new ClassName(param..1, param..2);

        Building b1 = new Building("Hotel",7);
        System.out.println("Taj " +b1.type + ", Floor " + b1.floor);

        Building b2 = new Building("Hotel",23);
        System.out.println("Leela " +b2.type + ", Floor " +b2.floor);




    }
}
