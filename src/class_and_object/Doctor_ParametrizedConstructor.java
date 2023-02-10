package class_and_object;

public class Doctor_ParametrizedConstructor {


    String Name;
    String Specialist;
    int experience;

    //parameterized constructor

    public Doctor_ParametrizedConstructor(String name, String specialist, int experience) {
        Name = name;
        Specialist = specialist;
        this.experience = experience;
    }

    public static void main(String[] args) {
        //className objName=new classname(parameter1,parameter2, ....);
        Doctor_ParametrizedConstructor obj1=new Doctor_ParametrizedConstructor("mohan", "cardio",10);
        System.out.println("this is obj1 name:" +obj1.Name +" This is obj1 specialization :" +obj1.Specialist +" This is obj experiance " +obj1.experience);
    }
}
