package collection;

import com.sun.deploy.util.JVMParameters;

import java.util.ArrayList;

public class DemoGenericAssig {

    public static void main(String args[]) {

        DemoGenericAssig obj = new DemoGenericAssig();

        ArrayList<String> List = obj.createStringList();



        for (String var : List) {

            System.out.println("This is List " + var);
        }
        ArrayList<Integer> List1 = obj.createIntegerList();

        for (Integer var : List1){

            System.out.println("this is List " + var);
        }
        ArrayList<Double> List2 = obj.createdoubleList();

        for(double var : List2){

            System.out.println("this is list " + var);
        }




         }

    public ArrayList<String> createStringList(){

        ArrayList <String> StringArrayList = new ArrayList<>();

        StringArrayList.add("java");
        StringArrayList.add("Spring boot");
        StringArrayList.add("Spring");
        StringArrayList.add("Microservice");

        return StringArrayList;
    }

    public ArrayList<Integer> createIntegerList(){

       ArrayList <Integer> IntegerArrayList = new ArrayList<>();

        IntegerArrayList.add(23);
        IntegerArrayList.add(54);
        IntegerArrayList.add(37);
        IntegerArrayList.add(12);

        return IntegerArrayList;
    }

    public ArrayList<Double>  createdoubleList(){

        ArrayList <Double> doubleArrayList = new  ArrayList<>();

        doubleArrayList.add(12.32);
        doubleArrayList.add(13.23);
        doubleArrayList.add(14.87);
        doubleArrayList.add(11.32);
        doubleArrayList.add(17.54);

        return doubleArrayList;
    }

        }




