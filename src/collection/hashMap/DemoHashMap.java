package collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createMap() {

        //SYNTAX of HashMap : HashMap <DataType_Key  , DataType_value> objName = new HashMap();

        HashMap<Integer, String> map = new HashMap<>();

        //adding elements

        map.put(1, "Java");
        map.put(2, "JEE");
        map.put(3, "Spring Booting");

        //Reading Data from hasMap
        System.out.println("Reading data from map :" + map.get(3));

        //we can not add duplicate keys in map, if we do, it will be override value with latest value

        map.put(1, "Java 8");
        System.out.println("Reading data from map :" + map.get(1));

        //map will allow only single null as a key and put it on first index

        map.put(null, "Micro Service");
        map.put(null, "Micro Service Developer");
        System.out.println(map);

        //How to print hasMap using advanced for loop keySet() : will return the keys as a set
        Set<Integer> keys = map.keySet(); // all keys
        for (Integer var : keys) {
            System.out.println("Printing maps using loop :" + map.get(var));
        }


    }

    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();
        obj.createMap();

    }
}
