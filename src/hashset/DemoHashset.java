package hashset;

import java.util.HashSet;

public class DemoHashset {

    public HashSet<String> creatStringset(){

        HashSet <String> set=new HashSet<>();

        set.add("Shekhar");
        set.add("Rahul");
        set.add("raman");
        set.add("Shekhar");

        System.out.println("Total Name : " +set.size());
        return set;
    }


    public HashSet<Integer> integerhashset(){

        HashSet <Integer> set=new HashSet<>();

        set.add(27);
        set.add(45);
        set.add(56);
        set.add(27);

        System.out.println(" Roll number set is : " +set.size());
        return set;
    }

    public HashSet<Double> doublehashset(){

        HashSet <Double> set=new HashSet<>();

        set.add(23.4);
        set.add(88.6);
        set.add(45.5);
        set.add(45.5);

        System.out.println("Double set is : "  +set.size());
        return set;
    }

    public static void main(String[] args) {

        DemoHashset obj=new DemoHashset();

        HashSet <String> set=obj.creatStringset();
        for (String var : set){
            System.out.println("Name is : " +var);
        }

    HashSet <Integer> set1=obj.integerhashset();
        for (Integer var : set1){
            System.out.println("Roll number : " +var);
        }

        HashSet <Double> set2=obj.doublehashset();
        for (Double var : set2){
            System.out.println("value : " +var);
        }
    }
}