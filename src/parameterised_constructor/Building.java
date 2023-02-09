package parameterised_constructor;

public class Building {

    //Properties of Building//

    String name;
    String location;
    int price;

    //Parameterised Constructor//

    public Building(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public static void main(String[] args) {

        //Storing data of different buildings by the help of parameterised constructor//

        //Syntax : ClassName objName = new ClassName(parameter1+parameter2+parameter3); //

        Building building1 = new Building("Dixit Complex", "Near Police Station", 988475779);
        System.out.println("Building name :" + building1.name + "  Location :" + building1.location + "  Price :" + building1.price);

        Building building2 = new Building("Omex", "Mathura", 89999688);
        System.out.println("Building name :" + building2.name + "  Location :" + building2.location + "  Price :" + building2.price);

        Building building3 = new Building("Krishna Palace", "Vrindavan", 766688879);
        System.out.println("Building name :" + building3.name + "  Location :" + building3.location + "  Price :" + building3.price);


    }
}
