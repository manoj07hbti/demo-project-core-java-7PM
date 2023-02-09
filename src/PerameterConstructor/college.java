package PerameterConstructor;

public class college {

  //  Data member
    String name;
    String city;
    int Student;
    int rooms;

    //perameter constructor


    public college(String name, String city, int student, int rooms) {
        this.name = name;
        this.city = city;
        Student = student;
        this.rooms = rooms;
    }

    public static void main(String args[]){

        //SYNTAX classname obj=new classname (parml1,parml2....)

        college obj1=new college(" Agra University","Agra",2000,250);

        System.out.println("name is:"+obj1.name+ "city is"+ obj1.city + "student is:" + obj1.Student +"rooms is" + obj1.rooms);

        college obj2=new college("Delhi University","Delhi",1500,150);

        System.out.println("name is:"+obj2.name + "city is:"+obj2.city + "student is" + obj2.Student+ "rooms is" + obj2.rooms);

        college obj3=new college("Mumbai University","Mumbai",1000,100);

        System.out.println("name is:"+obj3.name+"city is:"+ obj3.city +"student is:"+obj3.Student+ "rooms is"+obj3.rooms);









    }
}
