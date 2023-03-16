package collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapAssignment {

    // Assignment of HashMap with KeySet printing by advanced loop

    public void createHashMapAssignment() {

        //SYNTAX of HashMap : HashMap <DataType_Key , DataType_Value> objName = new HashMap

        HashMap<Double, String> hashMap = new HashMap<>();

        //adding elements in hashMap

        hashMap.put(1.1, "Aman Dev");
        hashMap.put(1.2, "Gaurav Dev");
        hashMap.put(1.3, "Anmol Kumari");

        //reading data from HashMap
        System.out.println("Printing data from HasMap :" + hashMap.get(1.2));


        // we can not duplicate key in map , if we do it , it will be override values with latest values

        hashMap.put(1.1, "Manoj Sir");
        System.out.println("Duplicate key OverRide the values with latest value :" + hashMap.get(1.1));

        //map will allow only single null as a key and put it on first index

        hashMap.put(null, "Core Java");

        hashMap.put(null, "Spring Booting");
        System.out.println(hashMap);

        //how to print map using loop keySet : will return all the keys as a set

        Set<Double> keys = hashMap.keySet();

        for (Double var : keys) {
            System.out.println("Printing HasMap using keysSet And Advanced for loop :" + hashMap.get(var));
        }


    }


    public static void main(String[] args) {
        HashMapAssignment obj = new HashMapAssignment();
        obj.createHashMapAssignment();


    }
}
