package collection.HashMap;

import java.util.HashMap;

public class DemoHashMap {

    public static void main(String args[]){
        DemoHashMap obj = new DemoHashMap();

        obj.createHashMap();

    }

    public void createHashMap(){

        HashMap <Integer,String> map=new HashMap<>();

        // adding data of HashMap

         map.put(1,"Rahul ");
         map.put(2,"Akash");
         map.put(3,"Shekhar");
         map.put(4,"Mohit");


         // reading data from hashMap

         System.out.println("Reading data from map " +map.get(1));
        map.put(1,"Mohit 5");
        System.out.println("Reading data from map " +map.get(1));

        map.put(null,"Micro Service");
        map.put(null,"Micro Service Developer");
        System.out.println(map);
    }

}
