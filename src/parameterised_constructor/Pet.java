package parameterised_constructor;

public class Pet {

    //Properties of a Pet//

    String name;
    String breed;
    int price;

    //Parameterised Constructor//

    public Pet(String name, String breed, int price) {
        this.name = name;
        this.breed = breed;
        this.price = price;
    }

    public static void main(String[] args) {

        //Storing data of different types of dogs by the use of parameterised constructor//

        //SYNTAX : ClassName objName = new ClassName(parameter1+parameter2+parameter3);

        Pet pet1 = new Pet("Jacky", "Bull Dog", 59996);
        System.out.println("Dog name :" + pet1.name + "  Breed :" + pet1.breed + "  Price :" + pet1.price);

        Pet pet2 = new Pet("Charlie", "German Shepherd", 76776);
        System.out.println("Dog name :" + pet2.name + "  Breed :" + pet2.breed + "  Price :" + pet2.price);

        Pet pet3 = new Pet("Buddy", "Labrador Retriever", 80006);
        System.out.println("Dog name :" + pet3.name + "  Breed :" + pet3.breed + "  Price :" + pet3.price);
    }
}
