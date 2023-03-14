package Collection.HashCode;

import Model.Student;

import java.util.LinkedHashSet;

public class StudentHashCodeDemo {



    public LinkedHashSet<Student> StudentData(){
        LinkedHashSet<Student> data= new LinkedHashSet();

        Student student1= new Student("Praveen",1,"Java");
        Student student2= new Student("Ajeet", 2,"Python");
        Student student3= new Student("Anurag", 3, "Ruby");
        Student student4= new Student("Ankit", 2, "DBA");
        System.out.println("Checking the HashCode : "+student1.hashCode());
        System.out.println("Checking the HashCode : "+student2.hashCode());
        System.out.println("Checking the HashCode : "+student3.hashCode());
        System.out.println("Checking the HashCode : "+student4.hashCode());

        data.add(student1);
        data.add(student2);
        data.add(student3);
        data.add(student4);

        return data;
    }

    public static void main(String[] args) {
        StudentHashCodeDemo obj= new StudentHashCodeDemo();
        LinkedHashSet<Student> var= obj.StudentData();
        for(Student var1 : var){
            System.out.println("Name : "+var1.getName()+" Roll No: : "+var1.getRollNo()+" Course : "+var1.getCourse());
        }
    }
}
