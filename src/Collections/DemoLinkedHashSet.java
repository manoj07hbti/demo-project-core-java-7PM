/*
 Programme to depict the difference between using HashSet and LinkedHashSet;
 While LinkedHashSet prints the data as per the sequence it is added;
Whereas HashSet prints the data randomly;
*/

package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    public void createHashSet(){
        HashSet<String> cityHashSet=new HashSet<>();
        cityHashSet.add("Mumbai");
        cityHashSet.add("Delhi");
        cityHashSet.add("Agra");
        cityHashSet.add("Patna");
        cityHashSet.add("Bangalore");
        System.out.println("\nSequence of printing city names by JVM using HashSet:");
        for (String var:cityHashSet){
            System.out.println(var);
        }
    }
    public void createLinkedHashSet(){
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Delhi");
        linkedHashSet.add("Agra");
        linkedHashSet.add("Patna");
        linkedHashSet.add("Bangalore");
        System.out.println("\nSequence of printing city name by JVM using LinkedHashSet:");
        for (String var:linkedHashSet){
            System.out.println(var);
        }

    }
    public static void main(String[] args) {
        DemoLinkedHashSet obj=new DemoLinkedHashSet();
        obj.createLinkedHashSet();
        obj.createHashSet();
    }


}
