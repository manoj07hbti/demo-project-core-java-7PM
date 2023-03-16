package collection.hashmap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedHashMap {


    public void createMap(){

        HashMap<Integer, Student> studentHashMap= new HashMap<>();
        // Data of Students
        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Rahul",2,"IT");
        Student student3= new Student("Mukesh",3,"CS");
        Student student4= new Student("Mohit",4,"IT");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);
        studentHashMap.put(4,student4);

        for(Integer var :studentHashMap.keySet()){

            System.out.println("Printing Student Map: "+studentHashMap.get(var).getName());

        }


    }

    public void createAdvancedMap(){

        HashMap <String, ArrayList<Student>> stringArrayListHashMap= new HashMap<>();

        ArrayList<Student> studentArrayList= new ArrayList<>();
        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Rahul",2,"IT");
        Student student3= new Student("Mukesh",3,"CS");
        Student student4= new Student("Mohit",4,"IT");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        stringArrayListHashMap.put("AGRA COLLEGE",studentArrayList);

        System.out.println( stringArrayListHashMap.get("AGRA COLLEGE"));


    }

    public static void main(String[] args) {

        AdvancedHashMap obj= new AdvancedHashMap();
        obj.createMap();
        obj.createAdvancedMap();
    }
}
