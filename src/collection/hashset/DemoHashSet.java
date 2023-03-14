package collection.hashset;

import com.sun.javafx.image.IntPixelGetter;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

    public HashSet <String> createStringSet(){

        // className objName= new ClassName();

        HashSet <String> set= new HashSet();
        set.add("Java");
        set.add("Spring boot");
        set.add("Micro service");
        set.add("Java");
        set.add("Spring boot");
        set.add("Micro service");


        System.out.println("Size of set is "+set.size());

        return set;
    }

    public void createLinkedHashSet(){

        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Agra");
        linkedHashSet.add("Jaipur");
        linkedHashSet.add("Pune");
        linkedHashSet.add("Mumbai");

        for (String var : linkedHashSet){

            System.out.println("Printing Linked HashSet: "+var);
        }

    }

    // create hashset of Integer


    public HashSet <Integer> createIntegerSet(){

        HashSet <Integer>  rollNoSet= new HashSet<>();

        rollNoSet.add(1);
        rollNoSet.add(2);
        rollNoSet.add(3);
        rollNoSet.add(1);
        rollNoSet.add(2);
        rollNoSet.add(3);

        return rollNoSet;
    }

    // Double set

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        HashSet <String> set=  obj.createStringSet();

        for(String var : set){

            System.out.println("Elements in set is : "+var);
        }


        HashSet<Integer>  output= obj.createIntegerSet();

        for(Integer var : output){

            System.out.println("Roll no is "+var);
        }

        obj.createLinkedHashSet();
    }
}
