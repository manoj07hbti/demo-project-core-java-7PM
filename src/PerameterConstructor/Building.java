package PerameterConstructor;

public class Building {
  //  Data member
    String name;
    int floors;
    String adress;

    //perameter constructor


  public Building(String name, int floors, String adress) {
    this.name = name;
    this.floors = floors;
    this.adress = adress;
  }

  public static void main(String args[]){

    //SYNTAX classname obj=new classname (parml1,parml2....)

          Building obj1=new Building("Mayers Mill",25,"Station St");

          System.out.println("name is:"+ obj1.name +"floors is:"+ obj1.floors +"adress is:"+obj1.adress);

          Building obj2=new Building("Abbott",45,"KingsRD");

          System.out.println("name is:"+ obj2.name+"floors is:"+ obj2.floors +"adress is:"+ obj2.adress);










    }
}
