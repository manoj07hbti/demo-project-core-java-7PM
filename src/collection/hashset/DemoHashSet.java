package collection.hashset;

import java.util.HashSet;

public class DemoHashSet {


    public static void main(String args[]){

        DemoHashSet obj = new DemoHashSet();
        HashSet <String> set=  obj.createStringSet();

        for(String var : set){

            System.out.println("Element in set is " + var);
        }
        HashSet <Integer> output = obj.createIntegerSet();

        for(Integer var : output){

            System.out.println("Counting in output is "+ var);
        }

        HashSet <Double> output1 = obj.createDoubleSet();

        for(Double var :output1){

            System.out.println("Printing of output is "+ var);
        }



        }

    public HashSet <String> createStringSet(){

        // className objName= new className();

        HashSet <String> set= new HashSet();

        set.add("Java");
        set.add("Spring Boot");
        set.add("Micro Service");
        set.add("Java");
        set.add("Spring Boot");
        set.add("Micro Service");

        System.out.println("Size of set is "+set.size());

        return set;

    }

    public HashSet<Integer> createIntegerSet(){

      HashSet <Integer> set = new HashSet();

       set.add(12);
       set.add(13);
       set.add(14);
       set.add(15);

       System.out.println("Size of set is" +set.size());

       return set;
    }

    public HashSet <Double> createDoubleSet(){

        HashSet <Double> set = new HashSet();

         set.add(21.2);
         set.add(22.3);
         set.add(23.3);
         set.add(24.4);

         System.out.println("Size of set is "+set.size());

         return set;

    }




    }


