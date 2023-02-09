package class_and_object;

public class Engineer {

    // Data Members //

    String name;
    int age;
    String dept;


    // parameterzied constructor //

    public Engineer(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[]args){

//  ClassName objName= new Classname(param1, param2.....); //

        Engineer engineer = new Engineer("Gaurav",22,"It" );

         System.out.println("Engineer Name Is "+engineer.name +": Engineer Age iS "+engineer.age +": Engineer Department "+engineer.dept);

        }


    }



