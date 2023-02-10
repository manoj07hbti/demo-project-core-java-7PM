package Java_create_classes;

public class Pet_animals {
    String name;
    int weight;
    int price;
    public Pet_animals (String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public static void main(String [] args){
        Pet_animals obj1 = new Pet_animals ("harjeet","computer science",25,35200);
        System.out.println("Pet_animals name is: "+obj1.name +", "+"Pet_animals age is: "+obj1.weight+", "+"Pet_animals price is: "+obj1.price);
        Pet_animals obj2 = new  Pet_animals ("aman", "mechanical ", 28,355522);
        System.out.println("Pet_animals name is: "+obj2.name +", "+"Pet_animals age is: "+obj2.weight+", "+"Pet_animals price is: "+obj2.price);

    }
}
