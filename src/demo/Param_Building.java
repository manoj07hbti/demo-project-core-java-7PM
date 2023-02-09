package demo;

public class Param_Building {
    String name;
    int floors;
    String address;

    public Param_Building(String name, int floors, String address) {

        this.name = name;
        this.floors = floors;
        this.address = address;
    }

    public static void main(String[] args){

            Param_Building obj1= new Param_Building("Veena Saaz",25,"Thakur complex mumbai");
            System.out.println("Name is: "+obj1.name + " floors is: "+obj1.floors +" address is: "+obj1.address);

            Param_Building obj2= new Param_Building("Vasant Marvel",14,"Borivali Mumbai");
            System.out.println("Name is: "+obj2.name + " floors is: "+obj2.floors+" address is: "+obj2.address);
    }
}

