package collection.advancedHashMap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class UniversityData {

    public HashMap<String, ArrayList<Student>> create(){

        HashMap<String, ArrayList<Student>> collegeList= new HashMap<>();

        ArrayList<Student> agraCollege= new ArrayList<>();
        ArrayList<Student> srkCollege= new ArrayList<>();
        ArrayList<Student> jsCollege= new ArrayList<>();

        Student st1= new Student("Praveen", 1 , "Java","Agra College");
        Student st2= new Student("Ajeet", 2, "Java","Agra College");
        Student st3= new Student("Anurag", 1, "Python", "SRK College");
        Student st4= new Student("Ankit",2,"DBA", "SRK College");
        Student st5= new Student("Manish", 1,"React", " JS College");
        Student st6= new Student("Aman", 2,"Ruby","JS College");

        agraCollege.add(st1);
        agraCollege.add(st2);
        srkCollege.add(st3);
        srkCollege.add(st4);
        jsCollege.add(st5);
        jsCollege.add(st6);

        collegeList.put("Agra College", agraCollege);
        collegeList.put("SRK College", srkCollege);
        collegeList.put("JS College", jsCollege);

        System.out.println("Please Enter the College Name :");
        Scanner sc= new Scanner(System.in);
        String check=sc.nextLine();
        System.out.println("Printing data of College : "+check);

        Set<String> keys=collegeList.keySet();
        for (String key : keys){
            if (key.equals(check)){
                ArrayList<Student> list= collegeList.get(key);
                for (Student var : list){
                    System.out.println("Name : " + var.getName()+" Roll Number : "+var.getRoll_no()+" Course : "+var.getCourse()+" College : "+var.getCollege_name());
                }
            }

        }

        return collegeList;
    }

    public static void main(String[] args) {
        UniversityData obj= new UniversityData();
        obj.create();
    }
}
