package Collection.HashSet;

import java.util.LinkedHashSet;

public class SequentialHashSet {

    public LinkedHashSet<String> LinkedHashSet(){
        LinkedHashSet<String> City= new LinkedHashSet();

        City.add("Agra");
        City.add("Noida");
        City.add("Delhi");
        City.add("Mumbai");
        City.add("Agra");

        for(String var : City){
            System.out.println("Printing Sequential HashSet : "+var);
        }
        return City;
    }

    public static void main(String[] args) {
        SequentialHashSet obj= new SequentialHashSet();
        LinkedHashSet<String> var1= obj.LinkedHashSet();
    }
}
