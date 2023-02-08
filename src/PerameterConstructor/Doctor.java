package PerameterConstructor;

public class Doctor {
    // Data member

    String name;
    int age;
    String depart;

    //perameter constructor


    public Doctor(String name, int age, String depart) {
        this.name = name;
        this.age = age;
        this.depart = depart;
    }

    public static void main(String args[]){

       //SYNTAX classname obj=new classname (parml1,parml2....)

          Doctor obj1=new Doctor("Tarun",23,"Dental");

        System.out.println("Obj name is : "+ obj1.name + " Obj 1 Age is "+ obj1.age +" Obj 1 Depart is "+ obj1.depart);

          Doctor obj2=new Doctor("Rahul",32,"Bones");

          System.out.println("obj name is :"+ obj2.name+ "obj 1 Age is "+ obj2.age+"obj 2 Depart is"+  obj2.depart);

          Doctor obj3=new Doctor("Ram",43, "Surgen");

          System.out.println("obj name is:"+ obj3.name + "obj 3 age is" + obj3.age +"obj 3 Depart is"+obj3.depart);

          Doctor obj4=new Doctor("Rajeev",29,"X-ray");

          System.out.println("obj name is:"+ obj4.name + "obj 4 age is"+ obj4.age +"obj 4 Depart is"+ obj4.depart);












    }
}
