package PerameterConstructor;

public class Pet {
    //Data member
     String pettype;
     String name;
     String foo;
     int age;
     //Perameter constructor


    public Pet(String pettype, String name, String foo, int age) {
        this.pettype = pettype;
        this.name = name;
        this.foo= foo;
        this.age = age;
    }

    public static void main(String args[]){

        //SYNTAX classname obj=new classname (parml1,parml2....)

        Pet obj1=new Pet("Dog","Sheru","Pet shake",6);


        System.out.println("pettype is:"+obj1.pettype +"name is:"+obj1.name+"foo is" +obj1.foo+"age is:"+obj1.age);





    }
}
