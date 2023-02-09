package demo;

public class Parameterzied_Constructordoctor {
    String name;
    int age;
    String dept;

    public Parameterzied_Constructordoctor(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {
        //SYNTAX: ClassName objNAme = new ClassName(param1, param2,.....);
        Parameterzied_Constructordoctor obj1= new Parameterzied_Constructordoctor("Nidheesh", 24, "Cardiac");
        System.out.println("Name is: "+obj1.name + " Age is: "+obj1.age +" Dept is: "+obj1.dept);

        Parameterzied_Constructordoctor obj2= new Parameterzied_Constructordoctor("Raj",27,"Dermatology");
        System.out.println("Name is: "+obj2.name + "Age is: "+obj2.age +"Dept is: "+obj2.dept);

    }
}
