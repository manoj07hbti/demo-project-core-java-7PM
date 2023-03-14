package Collection.list;

import model.student;

import java.util.ArrayList;

public class studentManagementSystem {
    public void createStudentArrayList(){
        ArrayList<student> studentArrayList = new ArrayList<>();
        // create data of student
        student student1 = new student("Ashish", 55, "power system");
        student student2 = new student("Akash", 56, "civil");
        student student3 = new student("nitin", 58, "EC");
        student student4 = new student("mrinal", 588, "CS");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        for (student var :  studentArrayList){
            System.out.println("data of students : " +var.getName() + " Roll no : " +var.getRoll_no());
        }

    }

    public static void main(String[] args) {
        studentManagementSystem obj= new studentManagementSystem();
        obj.createStudentArrayList();
    }
}
