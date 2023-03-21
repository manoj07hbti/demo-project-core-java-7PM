package collection;

import java.util.ArrayList;

public class DemoGenericsList {

    public  ArrayList <String>  createStingList() {
        // SYNTEX : Collection ObjectName = New Collection ();
        ArrayList<String> stringArrayList = new ArrayList<>();
        // Create Add Elements //
        stringArrayList.add("Lucky Singh ");
        stringArrayList.add("Durgesh Singh ");
        stringArrayList.add("Rohit Singh ");
        stringArrayList.add("Rahul Singh ");
        stringArrayList.add("Sorav Singh ");
        stringArrayList.add("Mayank  Singh");

        return stringArrayList;
    }

    public ArrayList<Integer>  createIntList(){

        ArrayList <Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(324);
        integerArrayList.add(555);
        integerArrayList.add(3245);
        integerArrayList.add(6655);
        integerArrayList.add(8960);
        integerArrayList.add(4354);

        return integerArrayList;
    }

    public  ArrayList<Double> createDoubleList(){

        ArrayList<Double> DoubleArrayList = new ArrayList<>();

        DoubleArrayList.add(2345.67);
        DoubleArrayList.add(5687.09);
        DoubleArrayList.add(3452.65);
        DoubleArrayList.add(6859.089);
        DoubleArrayList.add(2341656.9768);

        return DoubleArrayList;
    }

    public static void main(String[]args){

        DemoGenericsList obj = new DemoGenericsList();

        ArrayList <String> list= obj.createStingList();

        for(String var: list){

            System.out.println("Printing String List : "+var);
        }

        ArrayList<Integer> integerArrayList= obj.createIntList();

        for (int i=0; i<integerArrayList.size(); i++){

            System.out.println("Printing Integer List : "+integerArrayList.get(i));
        }

        ArrayList<Double> DoubleArrayList = obj.createDoubleList();


        int i =0;

        while (i<DoubleArrayList.size()){
            System.out.println("Printing Double List : "+DoubleArrayList.get(i));
            i++;
        }











    }

}
