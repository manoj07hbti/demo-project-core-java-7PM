package Java_create_classes;

public class Pet_animals {
    String name;
    int weight_Kg;
    int price;
    public Pet_animals (String name, int weight_Kg, int price){
        this.name = name;
        this.weight_Kg = weight_Kg;
        this.price = price;
    }
    public static void main(String [] args){
        Pet_animals obj1 = new Pet_animals("johnson",24,2500);
        System.out.println("Pet_animals name is: "+obj1.name +", "+"Pet_animals weight is: "+obj1.weight_Kg+", "+"Pet_animals price is: "+obj1.price);
        Pet_animals obj2 = new  Pet_animals ("haddan",  25, 2280);
        System.out.println("Pet_animals name is: "+obj2.name +", "+"Pet_animals weight is: "+obj2.weight_Kg+", "+"Pet_animals price is: "+obj2.price);

    }
}
