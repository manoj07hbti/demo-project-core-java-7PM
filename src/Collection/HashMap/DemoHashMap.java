package Collection.HashMap;

import java.util.HashMap;

public class DemoHashMap {

    public void CreateHashMap(){

        HashMap<Integer, String> map= new HashMap<>();

        map.put(1, "Java");
        map.put(2,"Python");
        map.put(3, "Ruby");
        map.put(3, "React");

        System.out.println("Printing : "+map.get(3));
    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.CreateHashMap();
    }
}
