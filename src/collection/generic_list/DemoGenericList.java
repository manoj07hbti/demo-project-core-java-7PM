package collection.generic_list;

import java.util.ArrayList;

public class DemoGenericList {

    //Demo String ArrayList, Integer ArrayList , Double Array List with Assignment

    //String Array list and Return
    public ArrayList<String> createStringList() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Java 8");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring Booting");
        stringArrayList.add("Micro Service");

        return stringArrayList;

    }

    //Integer Array list and return
    public ArrayList<Integer> createIntegerArrayList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(55);
        integerArrayList.add(68);
        integerArrayList.add(63);
        integerArrayList.add(34);

        return integerArrayList;
    }

    //Double Array List and Return
    public ArrayList<Double> createDoubleList() {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(547.99);
        doubleArrayList.add(365.44);
        doubleArrayList.add(544.43);
        doubleArrayList.add(456.88);

        return doubleArrayList;
    }

    public static void main(String[] args) {

        DemoGenericList obj = new DemoGenericList();
        ArrayList<String> list = obj.createStringList();

        for (String var : list) {
            System.out.println("This is String Array list :" + var);
        }

        ArrayList<Integer> integerArrayList = obj.createIntegerArrayList();

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println("This is Integer Array List :" + integerArrayList.get(i));
        }

        ArrayList<Double> doubleArrayList = obj.createDoubleList();
        for (double var : doubleArrayList) {
            System.out.println("This is Double Array List :" + var);
        }


    }
}
