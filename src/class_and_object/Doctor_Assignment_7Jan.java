package class_and_object;

public class Doctor_Assignment_7Jan{

    String name="Dr Bhatia";  //property name
    int experience=15;   ////property name
    String speacilist="cardiologist";   ////property name
    int fees=2000;   ////property name

    public static void main(String[] args) {
       //Syntax: ClassName objName= new ClassName();
        Doctor_Assignment_7Jan obj1=new Doctor_Assignment_7Jan(); //object created with the name obj1

        //Syntax:    objName.propertyName;
        System.out.println( "Printing object Name " + obj1.name);
        System.out.println("Printing objenct Experiance " +obj1.experience);
        System.out.println("Printing object Specialist" +obj1.speacilist);
        System.out.println("Printing object Fees"  +obj1.fees);



    }



}
