package collection.hashmap;

import model_1.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MultipleCollegeData {

    public HashMap<String, ArrayList<Student>> create() {

        HashMap<String, ArrayList<Student>> map= new HashMap<>();
        ArrayList<Student> agraCollege = new ArrayList<>();
        ArrayList<Student> srkCollege= new ArrayList<>();

        Student st1= new Student("Praveen", 1 , "Java","Agra College");
        Student st2= new Student("Ajeet", 2, "Java","Agra College");
        Student st3= new Student("Anurag", 1, "Python", "SRK College");
        Student st4= new Student("Ankit",2,"DBA", "SRK College");

        agraCollege.add(st1);
        agraCollege.add(st2);
        srkCollege.add(st3);
        srkCollege.add(st4);

        map.put("Agra College",agraCollege);
        map.put("SRK College", srkCollege);


        System.out.println("Enter the College Name : ");
        Scanner sc=new Scanner(System.in);
        String check= sc.nextLine();

        Set<String> keys=map.keySet();
        for(String key: keys){

            if(key.equals(check)){

                System.out.println("Printing data of Agra College ");

                ArrayList<Student> list= map.get(key);
                for(int i=0; i<list.size(); i++){
                    System.out.println("Printing List now "+list.get(i).getName());
                }

            }
        }
            /*for(Map.Entry<String,ArrayList<Student>> entry:map.entrySet()){
                if (entry.getKey().equals(check)){
                    for(Student var: entry.getValue())
                    System.out.println("Name : "+var.getName()+" Roll Number : "+var.getRoll_no()+" Course : "+var.getCourse()+" College : "+var.getCollege_name());
                }

        }*/

            return map;
    }

    public static void main(String[] args) {
        MultipleCollegeData obj= new MultipleCollegeData();
        obj.create();
    }
}
