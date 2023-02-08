package class_and_object;

public class College {

    //properties

   String name="Agra univercity";
    String city="Agra";
    int Student=2000;
    int rooms=100;

    public static void main (String args[]){

      // SYNTAX ClassName objectName= new ClassName();
        College object1=new College(); //object created with name obeject1
        //SYNTAX:objname.propertyname;

        System.out.println("Printing object name"+ object1. name);
        System.out.println("Priting object city"+ object1.city);
        System.out.println("Printing object Student"+object1.Student);
        System.out.println("Printing object room"+object1.rooms);


        College object2=new College();// object created with name obeject 2
        //SYNTAX:objname.propertyname;

        System.out.println("Printing object2 name" +object2.name);
        System.out.println("Priting object2 city"+ object2.city);
        System.out.println("Printing object2 Student"+object2.Student);
        System.out.println("Prnting object2 rooms" +object2.rooms);



       College object3=new College(); // object created with name obeject3
        System.out.println("Printing object3 name "+object3.name);
        System.out.println("Printing object3 city"+ object3.city);
        System.out.println("Printing object3 Student" +object3.Student);
        System.out.println("printing object3 rooms"+object3.rooms);











    }




}
