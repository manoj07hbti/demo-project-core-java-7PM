package class_and_object;

public class Doctor {


    // Data Members //

    String name;
    int age;
    String depart;
    double salary;


   // parameterzied constructor //

    public Doctor(String name, int age, String depart, double salary) {
        this.name = name;
        this.age = age;
        this.depart = depart;
        this.salary = salary;

    }
    public static void main(String[]args){

        //ClassName objName= new Classname(param1, param2.....);//


        Doctor obj = new Doctor("lucky",21, "Dental", 32465.86);

        System.out.println("Name Is  "+obj.name +" : Age IS  "+obj.age +" : Department  "+ obj.depart +" : Salary Is  "+obj.salary);
    }



}
