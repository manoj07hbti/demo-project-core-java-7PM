package Collection.hashMap;

import model.student;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedHashMap {
    public void createHashMap(){
        HashMap <Integer, student> studentHashMap = new HashMap<>();
        // create data of student
        student student1 = new student("Ashish", 55, "power system");
        student student2 = new student("Akash", 56, "civil");
        student student3 = new student("nitin", 58, "EC");
        student student4 = new student("mrinal", 588, "CS");

        studentHashMap.put(1, student1);
        studentHashMap.put(2, student2);
        studentHashMap.put(3, student3);
        studentHashMap.put(4, student4);

        for (Integer var : studentHashMap.keySet()){
            System.out.println("printing advanced hashmap element : " +studentHashMap.get(var).getName());
        }

    }

    public void createAdvancedMap(){
        HashMap <String, ArrayList<student>> studentAdancedMap = new HashMap<>();

        ArrayList <student> studentArrayList = new ArrayList<>();
        // create data of student
        student student1 = new student("Ashish", 55, "power system");
        student student2 = new student("Akash", 56, "civil");
        student student3 = new student("nitin", 58, "EC");
        student student4 = new student("mrinal", 588, "CS");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        studentAdancedMap.put("Agra college", studentArrayList);

        System.out.println(studentAdancedMap.get("Agra college"));

    }


    public static void main(String[] args) {
        AdvancedHashMap obj = new AdvancedHashMap();
        obj.createHashMap();

        obj.createAdvancedMap();
    }


}
