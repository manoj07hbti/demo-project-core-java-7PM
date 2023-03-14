package Collection.hashset;

import java.util.HashSet;

public class DemoHashSet {
    public HashSet <String> createHashset(){
        // Collection <DataType> objName = new Collection();
        HashSet <String> set = new HashSet();
        set.add("java");
        set.add("java");
        set.add("java 8");
        set.add("spring");
        set.add("spring");
        set.add("micro service");
        set.add("micro service");

        // want to know size of hashset
        System.out.println("Size of hashset : " +set.size());
        return set;
    }
    public HashSet <Integer> createHashsetRollNumber(){
        // Collection <DataType> objName = new Collection();
        HashSet <Integer> RollNumber = new HashSet();
        RollNumber.add(41);
        RollNumber.add(48);
        RollNumber.add(45);
        RollNumber.add(42);
        RollNumber.add(48);
        RollNumber.add(415);
        RollNumber.add(42);

        // want to know size of hashset
        System.out.println("Size of RollNumber : " +RollNumber.size());
        return RollNumber;
    }
public HashSet <Double> createHashsetmarks(){
        // Collection <DataType> objName = new Collection();
        HashSet <Double> marks = new HashSet();
    marks.add(41.4);
    marks.add(48.5);
    marks.add(45.5);
    marks.add(25.5);
    marks.add(48.5);
    marks.add(45.5);
    marks.add(25.5);


        // want to know size of hashset
        System.out.println("Size of marks : " +marks.size());
        return marks;
    }

    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet <String> set = obj.createHashset();
        HashSet <Integer> Roll = obj.createHashsetRollNumber();
        HashSet <Double> marks = obj.createHashsetmarks();

        for (String var : set){
            System.out.println("elements in set  : " +var);
        }
        for (Integer var : Roll){
            System.out.println("elements in Roll number  : " +var);
        }
        for (Double var : marks){
            System.out.println("elements in marks  : " +var);
        }
    }
}
