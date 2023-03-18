package Collections;

import java.util.HashSet;

public class StringHashset {
    public HashSet<String> createStringset() {
        // className objName= new ClassName ();
        HashSet<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Vikram");
        set.add("Yogesh");
        set.add("Ram");
        set.add("Vikram");
        set.add("Yogesh");
        System.out.println("Size of set is: " + set.size());
        return set;
    }

    public HashSet<Integer> createIntegerset() {
        HashSet<Integer> rollnoset = new HashSet<>();
        rollnoset.add(12);
        rollnoset.add(1);
        rollnoset.add(6);
        rollnoset.add(12);
        rollnoset.add(1);
        rollnoset.add(6);
        return rollnoset;

    }

    public HashSet<Double> createDoubleSet(){
        HashSet<Double> marksSet=new HashSet<>();
        marksSet.add(75.5);
        marksSet.add(85.5);
        marksSet.add(65.5);
        marksSet.add(75.5);
        marksSet.add(85.5);
        marksSet.add(95.5);
        return marksSet;
    }
    public static void main(String[] args) {

        StringHashset obj = new StringHashset();
        HashSet<String> set = obj.createStringset();
        for (String var : set) {
            System.out.println("Elements in set is:" + var);
        }

        HashSet<Integer> output = obj.createIntegerset();
        for (Integer var : output) {
            System.out.println("Roll no is " + var);
        }

        HashSet<Double> marks = obj.createDoubleSet();
        for (Double var:marks){
            System.out.println("Following are the Marks: "+var);
        }
    }
}

