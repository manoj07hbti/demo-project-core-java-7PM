package collection.hashset;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    //String linked hashSet
    public void createStringLinkedHashSet() {

        //SYNTAX of linkedHashset : className <DataType> objName = new className

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //add data of linked String hashSet

        linkedHashSet.add("Agra");
        linkedHashSet.add("Jaipur");
        linkedHashSet.add("Pune");
        linkedHashSet.add("Mumbai");

        for (String var : linkedHashSet) {
            System.out.println("Printing linkedHashSet :" + var);
        }
    }

    //Integer linked hashset

    public void createIntegerLinkedHashSet() {

        //SYNTAX of linkedHashset : className <DataType> objName = new className

        LinkedHashSet<Integer> linkedIntegerHashSet = new LinkedHashSet<>();

        // add data of IntegerLinked HashSet

        linkedIntegerHashSet.add(64);
        linkedIntegerHashSet.add(47);
        linkedIntegerHashSet.add(53);
        linkedIntegerHashSet.add(24);

        for (Integer var : linkedIntegerHashSet) {
            System.out.println("Printing Integer Linked Hashset :" + var);
        }

    }

    // Double Linked HashSet

    public void createDoubleLinkedHashSet() {

        //SYNTAX of linkedHashset : className <DataType> objName = new className

        LinkedHashSet<Double> linkedDoubleHashSet = new LinkedHashSet<>();

        //add data of linked double HashSet

        linkedDoubleHashSet.add(36453.66);
        linkedDoubleHashSet.add(64546.77);
        linkedDoubleHashSet.add(26324.66);

        for (Double var : linkedDoubleHashSet) {
            System.out.println("Printing Double Linked HashSet :" + var);
        }


    }


    public static void main(String[] args) {

        DemoLinkedHashSet obj = new DemoLinkedHashSet();

        obj.createStringLinkedHashSet();
        obj.createIntegerLinkedHashSet();
        obj.createDoubleLinkedHashSet();

    }


}


