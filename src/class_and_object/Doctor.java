package class_and_object;

public class Doctor {

    //data member

    String name;
    int age;
    String dept;

    // parameterized constructor

    public Doctor(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {

  //SYNTAX : ClassName objName= new Classname(param1, param2.....);

        Doctor obj1= new Doctor("Raj",23,"Dental");

        System.out.println("Obj name is : "+obj1.name + " Obj 1 Age is "+obj1.age +" Obj 1 Dept is "+obj1.dept);

        Doctor obj2= new Doctor("Rohit",24,"Heart");

        System.out.println(" Name : "+obj2.name +" Age: "+obj2.age +" Dept: "+obj2.dept);

        Doctor obj3= new Doctor("Mukesh", 34,"Surgen");

        System.out.println("Name: "+obj3.name +" Age: "+obj3.age +" Dept is "+obj3.dept );


    }
}
