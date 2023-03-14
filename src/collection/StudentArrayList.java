package collection;

import modal.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public void createStudentArrayList() {

        //Collection <DataType> objName = new Collection;

        ArrayList<Student> studentArrayList = new ArrayList<>();

        // create data of student

        Student student1 = new Student("Raj", 1, "CS");
        Student student2 = new Student("Aman", 2, "Electric");
        Student student3 = new Student("Gaurav", 3, "CS");
        Student student4 = new Student("Manoj", 4, "IT");

        // add data to list

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        for (Student var : studentArrayList) {
            System.out.println("Printing student Data : " + "Name :" + var.getName() + " RollNo :" + var.getRollNo() + "Section :" + var.getSection());
        }


    }

    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        obj.createStudentArrayList();
    }
}
