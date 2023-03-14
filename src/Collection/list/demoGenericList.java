package Collection.list;

import java.util.ArrayList;

public class demoGenericList {
    public void createStringList(){
        ArrayList <String> stringArrayList = new ArrayList<>();
        stringArrayList.add("java");
        stringArrayList.add("java8");
        stringArrayList.add("spring");
        stringArrayList.add("spring boot");
        stringArrayList.add("micro services");
        for (String var : stringArrayList){
            System.out.println("element of the stringarraylist : " +var );
        }
    }
    public ArrayList <String> createStringList1(){
        ArrayList <String> stringArrayList = new ArrayList<>();
        stringArrayList.add("java");
        stringArrayList.add("java8");
        stringArrayList.add("spring");
        stringArrayList.add("spring boot");
        stringArrayList.add("micro services");
        return stringArrayList;
    }
    public ArrayList<Integer> createIntegerList(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(8);
        integerArrayList.add(78);
        integerArrayList.add(877);
        integerArrayList.add(578);
        integerArrayList.add(8757);
        return integerArrayList;
    }
    public ArrayList<Double> createDoubleList(){
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(8.5);
        doubleArrayList.add(7.8);
        doubleArrayList.add(8.77);
        doubleArrayList.add(57.8);
        doubleArrayList.add(8757.1);
        return doubleArrayList;
    }

    public static void main(String[] args) {
        demoGenericList obj = new demoGenericList();
        obj.createStringList();
        ArrayList <String> array2 = obj.createStringList1();
        for (String var : array2){
            System.out.println("element of the stringarraylist1 : " +var );
        }

        ArrayList <Integer> array3 = obj.createIntegerList();
        for (int var : array3){
            System.out.println("element of the createIntegerList : " +var );
        }
        ArrayList <Double> array4 = obj.createDoubleList();
        for (double var : array4){
            System.out.println("element of the createdoubleList : " +var );
        }
    }

}
