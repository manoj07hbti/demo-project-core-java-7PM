package collection;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public void createStudentArrayList(){

        //Collection <DataType> objName= new Collection();

        ArrayList <Student> studentArrayList = new ArrayList<>();

        // create data of Student

        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Rahul",2,"IT");
        Student student3= new Student("Mukesh",3,"CS");
        Student student4= new Student("Mohit",4,"IT");

        // add data to list

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        for (Student var : studentArrayList){

            System.out.println("Printing Student Data : "+var.getName() +" Rollno : "+var.getRollNo() +"section: "+var.getSection());
        }

    }

    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();
        obj.createStudentArrayList();

    }

}
