package collaction;

import modal.Student;

import java.util.ArrayList;

public class StudentArraylist {

    public void creatStudentarraylist(){

        ArrayList <Student> list=new ArrayList<>();

        //creat data of  Students

        Student Student1 =new Student("Shekhar",23,"IT");
        Student Student2=new Student("karan",24,"Engineer");

        list.add(Student1);
        list.add(Student2);

        for (Student var : list){
            System.out.println("Students : " +var.getName()+ " : Roll no. : "+var.getRollnumber()+" : Section : " +var.getSection());
        }
    }

    public static void main(String[] args) {

        StudentArraylist obj=new StudentArraylist();

        obj.creatStudentarraylist();
    }
}
