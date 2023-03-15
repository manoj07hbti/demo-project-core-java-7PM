package collection.hashset;

import java.util.HashSet;

public class DemoHashSet {

    //String Hashset
    public HashSet<String> createStringSet() {

        //SYNTAX HashSet : className objName = new className

        //adding duplicate element and return

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring Boot");
        set.add("Micro service");
        set.add("Java");
        set.add("Spring Boot");
        set.add("Micro service");

        System.out.println("Size of String HashSet is :" + set.size());

        return set;
    }

    //Integer Hashset
    public HashSet<Integer> createIntegerSet() {

        //SYNTAX of HashSet : className objName = new className

        HashSet<Integer> rollNumSet = new HashSet<>();
        rollNumSet.add(1);
        rollNumSet.add(2);
        rollNumSet.add(3);
        rollNumSet.add(1);
        rollNumSet.add(2);
        rollNumSet.add(3);

        System.out.println("Size of Integer HashSet :" + rollNumSet.size());

        return rollNumSet;

    }

    //Double HashSet

    public HashSet<Double> createDoubleSet() {

        //SYNTAX of HashSet : className objName = new className
        HashSet<Double> salarySet = new HashSet<>();
        salarySet.add(3435.99);
        salarySet.add(5474.66);
        salarySet.add(5633.44);
        salarySet.add(7574.22);
        salarySet.add(3435.99);
        salarySet.add(5474.66);
        salarySet.add(5633.44);
        salarySet.add(7574.22);

        System.out.println("Size of Double HashSet :" + salarySet.size());

        return salarySet;

    }


    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet<String> set = obj.createStringSet();

        //Advanced for loop for printing all elements of String Hashset
        for (String var : set) {
            System.out.println("Elements in set is :" + var);
        }

        // Advanced for loop for printing all Integer HasSet
        HashSet<Integer> output = obj.createIntegerSet();
        for (Integer var : output) {
            System.out.println("Roll Num of  is : " + var);
        }

        //Advanced for loop for printing all Double HashSet
        HashSet<Double> salary = obj.createDoubleSet();
        for (Double var : salary) {
            System.out.println("Salary of Employee is :" + var);
        }


    }
}
