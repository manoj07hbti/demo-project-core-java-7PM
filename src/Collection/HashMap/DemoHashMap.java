package Collection.HashMap;

import javafx.scene.effect.SepiaTone;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void CreateHashMap(){

        HashMap<Integer, String> map= new HashMap<>();

        map.put(1, "Java");
        map.put(2,"Python");
        map.put(3, "Ruby");
        map.put(3, "React");
        map.put(null, "Database");

        System.out.println("Printing 1st Element : "+map.get(1)+" Printing 2nd Element : "+map.get(2));

        Set<Integer> var=map.keySet();
        for(Integer var1 : var){
            System.out.println("Printing all Elements of HashMap : "+map.get(var1));
        }

    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.CreateHashMap();
    }
}
