package collection.hashmap;

import demo.Demo;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createMap(){

        //HashMap <Datatype_key, Datatype_value>  objName= new HashMap();

        HashMap <Integer,String> map= new HashMap<>();
       // adding data into HashMap
        map.put(1,"Java");
        map.put(2,"J2EE");
        map.put(3,"Spring Boot");

        // reading data from hashMap
        System.out.println("Reading data from map: "+map.get(3));
        map.put(1,"Java 8");
        System.out.println("Reading data from map: "+map.get(1));

        map.put(null,"Microservice");
        map.put(null,"Microservice Developer");
        System.out.println(map);

        // how to print map using loop keySet()  -> will return all the keys as a set
        Set<Integer> keys=map.keySet();// all keys
        for(Integer var: keys){

            System.out.println("Printing Map using loop : "+map.get(var));
        }

    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
    }
}
