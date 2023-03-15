package collection.hashset;

import modal.Student;

import java.util.HashSet;

public class DemoStudentHashSet {

    public HashSet<Student> create() {

        HashSet<Student> studentHashSet = new HashSet<>();

        // create data of students with hashcode

        Student student1 = new Student("Raj", 1, "CS");
        System.out.println("Printing HasCode of Student1 :" + student1.hashCode());

        Student student2 = new Student("Aman", 2, "Electric");
        System.out.println("Printing HasCode of Student2 :" + student2.hashCode());

        Student student3 = new Student("Gaurav", 3, "CS");
        System.out.println("Printing HasCode of Student3 :" + student3.hashCode());

        Student student4 = new Student("Manoj", 4, "IT");
        System.out.println("Printing HasCode of Student4 :" + student4.hashCode());

        Student student5 = new Student("Raj", 1, "CS");
        System.out.println("Printing HasCode of Student5 :" + student5.hashCode());

        Student student6 = new Student("Aman", 2, "Electric");
        System.out.println("Printing HasCode of Student6 :" + student6.hashCode());


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

        // advanced for loop printing students Hashset by override hashcode and equals

        for (Student var : students) {
            System.out.println("Printing students :" + var.getName() + "    Roll No :" + var.getRollNo() + "     Section :" + var.getSection());
        }

    }

}
