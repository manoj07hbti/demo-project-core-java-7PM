package PerameterConstructor;

public class Engineer {
    // Data member
    String name;
    int age;
    String city;
    String Speciality;

    //properity constructor
    public Engineer(String name, int age, String city, String speciality) {
        this.name = name;
        this.age = age;
        this.city = city;
        Speciality = speciality;
    }
    public static void main(String args[]){

        //SYNTAX : ClassName objName= new Classname(param1, param2.....);

        Engineer obj1=new Engineer("Mohit Sharma",32,"Pune","Software Engineer");

        System.out.println("name is:"+obj1.name +"age is:"+obj1.age +"city is:"+obj1.city+"speciality is:"+obj1.Speciality);

        Engineer obj2=new Engineer("Harsh Shukla",38,"Agra","Computer Engineer");

        System.out.println("name is:"+obj2.name+ "age is:"+obj2.age+ "city is:"+obj2.city+ "Speciality is:"+ obj2.Speciality);























    }
}

