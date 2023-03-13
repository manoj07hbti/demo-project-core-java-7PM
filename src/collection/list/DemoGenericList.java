package collection.list;

import java.util.ArrayList;

public class DemoGenericList {


    public ArrayList<String> createStringList(){

        ArrayList <String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Java");
        stringArrayList.add("Java 8");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring Boot");
        stringArrayList.add("Micro service");

        return stringArrayList;
    }


    public  ArrayList <Integer> createIntegerList(){

        ArrayList <Integer> integerArrayList= new ArrayList<>();

        integerArrayList.add(334);
        integerArrayList.add(34);
        integerArrayList.add(324);
        integerArrayList.add(11);

        return integerArrayList;
    }

// TODO create Double ArrayList


    public static void main(String[] args) {

        DemoGenericList obj= new DemoGenericList();
        ArrayList<String> list=  obj.createStringList();

        for(String var : list){

            System.out.println("This is list "+var);
        }

        ArrayList <Integer> integerArrayList=  obj.createIntegerList();

        for(int i=0; i<integerArrayList.size(); i++){

            System.out.println("Printing List "+integerArrayList.get(i));
        }

    }
}
