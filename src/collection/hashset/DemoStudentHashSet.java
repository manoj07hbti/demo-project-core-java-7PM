package collection.hashset;

import model.Student;

import java.util.HashSet;

public class DemoStudentHashSet {

    public  HashSet <Student> create(){

        HashSet <Student> studentHashSet= new HashSet<>();

        // create data of student
        Student student1= new Student("Raj",1,"CS");

        System.out.println("Printing hashcode of student1 : "+student1.hashCode());

        Student student2= new Student("Rahul",2,"IT");
        System.out.println("Printing hashcode of student2 : "+student2.hashCode());

        Student student3= new Student("Mukesh",3,"CS");
        System.out.println("Printing hashcode of student3 : "+student3.hashCode());

        Student student4= new Student("Mohit",4,"IT");
        System.out.println("Printing hashcode of student4 : "+student4.hashCode());

        Student student5= new Student("Raj",1,"CS");
        System.out.println("Printing hashcode of student5 : "+student5.hashCode());

        Student student6= new Student("Rahul",2,"IT");
        System.out.println("Printing hashcode of student6 : "+student6.hashCode());
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
