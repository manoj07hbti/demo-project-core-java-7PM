package class_and_object;

public class College {
    // College properties are : name, city, student number stN, teaN
    String name= "delhi university";
    String city = "Delhi";
    int stN = 4000;
    int teaN = 120;

    public static void main(String[] args) {
        College obj1 = new College();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object1 name : " + obj1.name);
        System.out.println("Printing object1 city :" + obj1.city);
        System.out.println("Printing object1 stN :" + obj1.stN);
        System.out.println("Printing object1 teaN :" + obj1.teaN);

        College obj2 = new College();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object2 name :" + obj2.name);
        System.out.println("Printing object2 city :" + obj2.city);
        System.out.println("Printing object2 stN :" + obj2.stN);
        System.out.println("Printing object2 teaN :" + obj2.teaN);

        College obj3 = new College();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object3 name :" + obj3.name);
        System.out.println("Printing object3 city :" + obj3.city);
        System.out.println("Printing object3 stN :" + obj3.stN);
        System.out.println("Printing object3 teaN :" + obj3.teaN);
    }
}
