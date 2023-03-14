package Collection.hashset;

import model.student;

import java.util.HashSet;

public class studentHashSet {
    public HashSet<student> createStudentHashSet(){
        HashSet<student> set = new HashSet();
        // create data of student
        student student1 = new student("Ashish", 55, "power system");
        student student2 = new student("Akash", 56, "civil");
        student student3 = new student("nitin", 58, "EC");
        student student4 = new student("mrinal", 588, "CS");
        student student5 = new student("Ashish", 55, "power system");
        student student6 = new student("mrinal", 588, "CS");

        // add data in set
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);

        System.out.println("Total number of students in class : = " +set.size());

        return set;

    }

    public static void main(String[] args) {
        studentHashSet obj = new studentHashSet();
        HashSet<student> set = obj.createStudentHashSet();

        for (student var : set){
            System.out.println("printing student : " +var.getName() + " roll number : " + var.getRoll_no());
        }
    }
}
