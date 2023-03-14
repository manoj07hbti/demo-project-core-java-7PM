package Collection.HashSet;

import Model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> StudentData(){
        HashSet<Student> data= new HashSet();

        Student data1= new Student("Praveen",1,"Java");
        Student data2= new Student("Raj",2,"Python");
        Student data3= new Student("Ajeet",3,"DBA");


        data.add(data1);
        data.add(data2);
        data.add(data3);


        return data;
    }

    public static void main(String[] args) {
        StudentHashSet obj= new StudentHashSet();
        HashSet<Student> details=obj.StudentData();
        for(Student var: details){
            System.out.println("Student Name: "+var.getName()+" Roll Number : "+var.getRollNo()+" Course : "+var.getCourse());
        }
    }
}
