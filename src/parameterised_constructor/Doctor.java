package parameterised_constructor;

public class Doctor {

    //Properties of a Doctor//

    String name;
    int age;
    String speciality;

    //Parameterised constructor//


    public Doctor(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public static void main(String[] args) {

        //Storing different data of Doctor by the use of parameterised constructor//

        //Syntax: ClassName objName= new ClassName(parameter1+parameter2+parameter3);  //

        Doctor obj1 = new Doctor("Dr.Ajay Shrama", 35, "Heart Surgeon");
        System.out.println("Doctor name :" + obj1.name + "  Age :" + obj1.age + "  Speciality :" + obj1.speciality);

        Doctor obj2 = new Doctor("Dr.Vijay Singh", 45, "Skin Specialist");
        System.out.println("Doctor name :" + obj2.name + "  Age :" + obj2.age + "  Speciality :" + obj2.speciality);

        Doctor obj3 = new Doctor("Dr.Ravindra Yadav", 55, "Eye Specialist");
        System.out.println("Doctor name :" + obj3.name + "  Age :" + obj3.age + "  Speciality :" + obj3.speciality);
    }
}
