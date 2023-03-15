package Collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class demoHashMap {
    public void createHashmap(){

// HashMap <Datatype_key, DataType_value> objName = new Hashmap<>();
        HashMap <Integer, String> map = new HashMap<>();

        // adding data into HashMap
        map.put(1, "java");
        map.put(2, "J2EE");
        map.put(3, "spring boot");

        // printing hashmap
        System.out.println("printing hashmap : " +map.get(3) );

        map.put(2, "java 8 ");
        System.out.println("printing hashmap : " +map.get(2) );

        map.put(null, "microservice ");
        System.out.println(map);
        map.put(null, "microservice developer");
        System.out.println(map);

        // printing hashmap using for loop KeySet
        Set<Integer> keys = map.keySet();
        for (Integer var : keys){
            System.out.println("priting hashmap using for loop : " +map.get(var));
        }
    }

    public static void main(String[] args) {
        demoHashMap obj = new demoHashMap();
        obj.createHashmap();
    }
}
