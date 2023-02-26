package class_and_object;

public class Engineer {

    // Properties

    String Name = "Er. Vishal";
    String Trade = "Civil";
    int age = 29;

    public static void main(String[] args) {

        // ClassName objName = new ClassName();

        Engineer obj1 = new Engineer();
        System.out.println("Er. Name obj1 :- " +obj1.Name);
        System.out.println("Er. Trade obj1 :- " +obj1.Trade);
        System.out.println("Er. Age obj1 :- " +obj1.age);

        Engineer obj2 = new Engineer();
        System.out.println("Er. Name obj2 :- " +obj2.Name);
        System.out.println("Er. Trade obj2 :- " +obj2.Trade);
        System.out.println("Er. Age obj2 :- " +obj2.age);

    }
}
