package Collection.hashset;

import model.student;

import java.util.HashSet;

public class studentHashSetWithHashcode {
    public HashSet<student> createStudentHashSet(){
        HashSet<student> set = new HashSet();
        // create data of student
        student student1 = new student("Ashish", 55, "power system");
        System.out.println("Printing hashcode of student1 : " +student1.hashCode());

        student student2 = new student("Akash", 6, "civil");
        System.out.println("Printing hashcode of student2 : " +student2.hashCode());

        student student3 = new student("nitin", 8, "EC");
        System.out.println("Printing hashcode of student3 : " +student3.hashCode());

        student student4 = new student("mrinal", 588, "CS");
        System.out.println("Printing hashcode of student4 : " +student4.hashCode());

        student student5 = new student("Ashish", 55, "power system");
        System.out.println("Printing hashcode of student5 : " +student5.hashCode());

        student student6 = new student("mrinal", 588, "CS");
        System.out.println("Printing hashcode of student6 : " +student6.hashCode());

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
        studentHashSetWithHashcode obj = new studentHashSetWithHashcode();
        HashSet<student> set = obj.createStudentHashSet();

        for (student var : set){
            System.out.println("printing student : " +var.getName() + " roll number : " + var.getRoll_no());
        }
    }
}
