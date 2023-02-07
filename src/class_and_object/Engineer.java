package class_and_object;

public class Engineer {
    // Engineer properties are : name, age, branch, bestIn
    String name= "Raju";
    int age = 43;
    String branch = "Electrical";
    String bestIn = "java";

    public static void main(String[] args) {
        Engineer obj1 = new Engineer();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object1 name : " + obj1.name);
        System.out.println("Printing object1 age :" + obj1.age);
        System.out.println("Printing object1 branch :" + obj1.branch);
        System.out.println("Printing object1 bestIn :" + obj1.bestIn);

        Engineer obj2 = new Engineer();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object2 name :" + obj2.name);
        System.out.println("Printing object2 age :" + obj2.age);
        System.out.println("Printing object2 branch :" + obj2.branch);
        System.out.println("Printing object2 bestIn :" + obj2.bestIn);

        Engineer obj3 = new Engineer();// object created with name obj1

        //SYNTAX :  objName.propertyName;
        System.out.println("Printing object3 name :" + obj3.name);
        System.out.println("Printing object3 age :" + obj3.age);
        System.out.println("Printing object3 branch :" + obj3.branch);
        System.out.println("Printing object3 bestIn :" + obj3.bestIn);
    }
    }
