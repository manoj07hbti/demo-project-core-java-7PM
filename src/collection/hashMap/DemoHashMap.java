package collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void CreateHashMap(){

        HashMap<Double, String> map= new HashMap<>();

        map.put(1.1, "Java");
        map.put(2.1,"Python");
        map.put(3.1, "Ruby");
        map.put(3.1, "React");
        map.put(null, "Database");
        map.put(null, "DBA");

        //System.out.println(map);
        //System.out.println("Printing 1st Element : "+map.get(1.0)+" Printing 2nd Element : "+map.get(2.1));

        Set<Double> var=map.keySet();
        for(Double var1 : var){
            System.out.println("Printing all Elements of HashMap : "+map.get(var1));
        }

    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.CreateHashMap();
    }
}
