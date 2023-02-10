package class_and_object;

public class Building_Assignment_7jan {

    String name;

    int floor;

    int tower;
    double price;
    //Parameterized constructor
    public Building_Assignment_7jan(String name, int floor, int tower, double price) {
        this.name = name;
        this.floor = floor;
        this.tower = tower;
        this.price = price;
    }

    public static void main(String[] args) {

        //syntax: classname objName=new classname (Parameter 1, parameter 2 , ...);
        Building_Assignment_7jan obj1=new Building_Assignment_7jan("gaur",15, 11, 355555.22);
        System.out.println("Obj1  Name is :"+obj1.name + "obj1 floor is : " +obj1.floor + "obj1 tower is :" +obj1.tower + "obj price is :" +obj1.price);

        Building_Assignment_7jan obj2=new Building_Assignment_7jan("ats",25,10,5555.55);
        System.out.println("Obj 2 name is :"  +  obj2.name  + "  Obj2 floor is :"   +  obj2.floor  + "  obj3 tower is :" + obj2.tower);

    }

}
