package collection;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public void createArrayList(){
        // Collection <Datatype> objName= new Collection();
        ArrayList < Student>  studentArray =new ArrayList<>();

        //create data of student
        Student student1=new Student("Raj", 1, "CS");
        Student student2=new Student("Mohit", 2,"IT");
        Student student3=new Student("Kishor", 3,"Mechnical");

        //add data to list
        studentArray.add(student1);
        studentArray.add(student2);
        studentArray.add(student3);

        for(Student var:studentArray){
            System.out.println("printing student data " +var.getName() +"roll no :"+var.getRollno() +"section :"+var.getSection() );
        }
    }

    public static void main(String[] args) {
        StudentArrayList obj=new StudentArrayList();
        obj.createArrayList();

    }
}
