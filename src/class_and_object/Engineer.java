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

         Engineer obj1 = new Engineer("Mukesh", 24, "IIT");

         System.out.println("Engineer Name "+obj1.name +": Engineer Age "+obj1.age +": Engineer Department ");

         Engineer obj2 = new Engineer("Amit", 23,"CS");

         System.out.println("Engineer Name "+obj2.name +": Engineer Age "+obj2.age +": Engineer Department "+obj2.dept);

         Engineer obj3 =new Engineer("Lucky", 25, "Sa");

         System.out.println("Engineer Name "+obj3.name +": Engineer Age "+obj3.age +": Engineer Department "+obj3.dept);

         Engineer obj4 =new Engineer("Shiva", 20,"Is");

         System.out.println("Engineer Name "+obj4.name +": Engineer Age "+obj4.age +": Engineer Department "+obj4.dept);
        }


    }



