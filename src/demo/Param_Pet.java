package demo;

public class Param_Pet {
    String name;
    int age;
    String breed;

    public Param_Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static void main(String[] args) {
        Param_Pet obj1= new Param_Pet("Sunny",5,"Pomerian");
        System.out.println("Name is: "+obj1.name + " Age is: "+obj1.age +" breed is: "+obj1.breed);

        Param_Pet obj2= new Param_Pet("Oreo",6,"Pitbull");
        System.out.println("Name is: "+obj2.name + " Age is: "+obj2.age +" breed is: "+obj2.breed);
    }
}
