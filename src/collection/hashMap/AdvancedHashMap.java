package collection.hashMap;

import modal.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedHashMap {

    public void createMap() {

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        Student student1 = new Student("Raju", 1, "CS");
        Student student2 = new Student("Aman", 2, "IT");
        Student student3 = new Student("Golu", 3, "CS");
        Student student4 = new Student("Manu", 4, "IT");

        //add data
        studentHashMap.put(1, student1);
        studentHashMap.put(2, student2);
        studentHashMap.put(3, student3);
        studentHashMap.put(4, student4);

        //printing data of studentHashMap

        for (Integer var : studentHashMap.keySet()) {
            System.out.println("Printing student HashMap :" + studentHashMap.get(var).getName() + "  Roll No :" + studentHashMap.get(var).getRollNo() + "  Section :" + studentHashMap.get(var).getSection());
        }


    }

    public void createAdvancedMap() {

        HashMap<String, ArrayList<Student>> stringArrayListHashMap = new HashMap<>();

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("Raju", 1, "CS");
        Student student2 = new Student("Aman", 2, "IT");
        Student student3 = new Student("Golu", 3, "CS");
        Student student4 = new Student("Manu", 4, "IT");

        //adding data

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        stringArrayListHashMap.put("Agra Collage", studentArrayList);

        System.out.println(stringArrayListHashMap.get("Agra Collage"));

    }


    public static void main(String[] args) {

        AdvancedHashMap obj = new AdvancedHashMap();
        obj.createMap();
        obj.createAdvancedMap();


    }
}
