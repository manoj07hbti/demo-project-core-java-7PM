package collepsionMethod.hashCodeCollection;

import java.util.HashSet;

public class StringHashSet {
    //Q what is collection method which don't store duplicate element
    // Ans: HashSet Collection used to store unique element, don't allow duplicate element in the list
    // get method is not use in this

    public HashSet<String> createStringSet(){

        HashSet<String> StringSet= new HashSet<>();

        StringSet.add("mango");
        StringSet.add("banana");
        StringSet.add("papaya");
        StringSet.add("tomato");
        StringSet.add("mango");
        System.out.println("printing is "+StringSet.size());

        return StringSet;
    }

    public static void main(String [] agrs){
        StringHashSet obj = new StringHashSet();
        HashSet<String> Set = obj.createStringSet();
        for(String var : Set){
            System.out.println("printing Set is "+var);
        }

    }
}
