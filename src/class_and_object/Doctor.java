package class_and_object;

public class Doctor {

    //Properties of Doctor//
    String name = "Dr.Shivam Sharma";
    String city = "Agra";
    int age = 35;
    int experience = 9;
    String speciality = "Dermatologist";

    public static void main(String[] args) {
        //SYNTAX : ClassName objName new ClassName();//
        //obj printing : +obj1.name;//
        Doctor obj1 = new Doctor();
        System.out.println("Printing doctor name :" + obj1.name);
        System.out.println("Printing doctor city name :" + obj1.city);
        System.out.println("printing doctor age :" + obj1.age);
        System.out.println("Printing doctor experience :" + obj1.experience);
        System.out.println("Printing doctor speciality :" + obj1.speciality);
    }


}
