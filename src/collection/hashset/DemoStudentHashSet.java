package collection.hashset;

import modal.Student;

import java.util.HashSet;

public class DemoStudentHashSet {

    public HashSet<Student> create() {

        HashSet<Student> studentHashSet = new HashSet<>();

        // create data of students

        Student student1 = new Student("Raj", 1, "CS");
        Student student2 = new Student("Aman", 2, "Electric");
        Student student3 = new Student("Gaurav", 3, "CS");
        Student student4 = new Student("Manoj", 4, "IT");
        Student student5 = new Student("Raj", 1, "CS");
        Student student6 = new Student("Aman", 2, "Electric");


        // add data to set

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);

        System.out.println("Size of Student data :" + studentHashSet.size());

        return studentHashSet;
    }

    public static void main(String[] args) {

        DemoStudentHashSet obj = new DemoStudentHashSet();
        HashSet<Student> students = obj.create();

        // advanced for loop printing students Hashset

        for (Student var : students) {
            System.out.println("Printing students :" + var.getName() + "    Roll No :" + var.getRollNo() + "     Section :" + var.getSection());
        }

    }

}
