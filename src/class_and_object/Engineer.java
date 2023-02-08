package class_and_object;

public class Engineer {

    //Properties of Engineer//
    String name = "Aman Dev";
    int age = 24;
    String branch = "Information Technology";
    double salary = 75000.501;

    public static void main(String[] args) {
        //SYNTAX : ClassName objName= new ClassName();//
        //        //obj printing : +obj1.name;//

        Engineer obj1 = new Engineer();
        System.out.println("Printing ENGINEER name :" + obj1.name);
        System.out.println("Printing age :" + obj1.age);
        System.out.println("Printing branch :" + obj1.branch);
        System.out.println("Printing salary :" + obj1.salary);
    }
}
