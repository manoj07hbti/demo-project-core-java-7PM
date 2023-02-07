package class_and_object;

public class Book {

    // properties

   String name="java";
   int pages=500;
   String writeName="Games Gosling";
   double price=435.56;


    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        Book obj1= new Book();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object1 name "+obj1.name);
        System.out.println("Printing object1 page "+obj1.pages);
        System.out.println("Printing object1 writer "+obj1.writeName);
        System.out.println("Printing object1 price "+obj1.price);

        Book obj2= new Book();// object created with name obj2

        System.out.println("Printing object2 name "+obj2.name);
        System.out.println("Printing object2 page "+obj2.pages);
        System.out.println("Printing object2 writer "+obj2.writeName);
        System.out.println("Printing object2 price "+obj2.price);

        Book obj3= new Book();// object created with name obj3

        System.out.println("Printing object3 name "+obj3.name);
        System.out.println("Printing object3 page "+obj3.pages);
        System.out.println("Printing object3 writer "+obj3.writeName);
        System.out.println("Printing object3 price "+obj3.price);

    }

}
