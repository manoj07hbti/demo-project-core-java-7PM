package collection.hashMap;

import modal.Student;

import java.util.ArrayList;

public class Assignment {

    public void ArrayList() {

        //Assignment......................................................

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("Raju", 1, "CS");
        Student student2 = new Student("Aman", 2, "CS");
        Student student3 = new Student("Gaurav", 3, "CS");
        Student student4 = new Student("Manoj", 4, "IT");
        Student student5 = new Student("Deepak", 5, "CS");
        Student student6 = new Student("Vishal", 6, "IT");
        Student student7 = new Student("Nitesh", 7, "CS");
        Student student8 = new Student("Devesh", 8, "IT");

        //adding elements
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);

        //Find the last element of ArrayList

        // to find the last element of ArrayList first we find the size of list : list.size();
        System.out.println("Size of Array list :" + studentArrayList.size());

        //then we have to print the last element with the help of : list.get(list.size()-1);
        System.out.println("Last element of Array List :" + "Name :" + studentArrayList.get(studentArrayList.size() - 1).getName() + "    Roll No :" + studentArrayList.get(studentArrayList.size() - 1).getRollNo() + " Section :" + studentArrayList.get(studentArrayList.size() - 1).getSection());

        // Find the second element of Array List : list.get(1);
        System.out.println("Second element of Array List :" + " Name :" + studentArrayList.get(1).getName() + "   Roll No :" + studentArrayList.get(1).getRollNo() + " Section :" + studentArrayList.get(1).getSection());

        // Find out the IT Section Students

        //Printing IT Section student
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getSection().equals("IT")) {
                System.out.println("Students found from IT Section :" + "Name :" + studentArrayList.get(i).getName() + " Roll No : " + studentArrayList.get(i).getRollNo() + " Section :" + studentArrayList.get(i).getSection());
            }
        }
    }

    public static void main(String[] args) {

        Assignment obj = new Assignment();
        obj.ArrayList();
    }

}
