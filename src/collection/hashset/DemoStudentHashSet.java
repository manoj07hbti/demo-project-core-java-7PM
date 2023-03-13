package collection.hashset;

import model.Student;

import java.util.HashSet;

public class DemoStudentHashSet {

    public  HashSet <Student> create(){

        HashSet <Student> studentHashSet= new HashSet<>();

        // create data of student
        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Rahul",2,"IT");
        Student student3= new Student("Mukesh",3,"CS");
        Student student4= new Student("Mohit",4,"IT");
        Student student5= new Student("Raj",1,"CS");
        Student student6= new Student("Rahul",2,"IT");

        // add data to set

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);

        return studentHashSet;
    }


    public static void main(String[] args) {

        DemoStudentHashSet obj= new DemoStudentHashSet();

        HashSet <Student>  students= obj.create();

        for(Student var: students){

            System.out.println("Printing Students : "+var.getName()+ " rollNo: "+var.getRollNo()+" Section: "+var.getSection());

        }

    }
}
