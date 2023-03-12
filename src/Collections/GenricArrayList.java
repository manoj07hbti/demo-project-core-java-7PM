/* Program to print Generic collection of array list using different Data Types & Adv. Loop
   Program Name: GenricArrayList.java
   Program Date: 11-March-2023
   Program Auth: Aanchal Atre
*/
package Collections;

import java.util.ArrayList;

public class GenricArrayList {

    public ArrayList<String> createStringList() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("English");
        stringArrayList.add("Hindi");
        stringArrayList.add("Marathi");
        stringArrayList.add("Maths");
        stringArrayList.add("EVS");
        stringArrayList.add("Computers");

        return stringArrayList;

    }
    public ArrayList<Integer> createIntegerList(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(01);
        integerArrayList.add(02);
        integerArrayList.add(03);
        integerArrayList.add(04);
        integerArrayList.add(05);
        integerArrayList.add(06);

        return integerArrayList;
    }
    public ArrayList<Double> createDoubleList(){
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(12.35);
        doubleArrayList.add(13.35);
        doubleArrayList.add(14.35);
        doubleArrayList.add(15.35);
        doubleArrayList.add(16.35);
        doubleArrayList.add(17.35);

        return doubleArrayList;
    }
    public static void main(String[] args) {
        GenricArrayList obj = new GenricArrayList();
        ArrayList<String> list = obj.createStringList();
        System.out.println("List of Subjects: ");
        for(String var: list){
            System.out.println(var);
        }
        ArrayList<Integer> list1 = obj.createIntegerList();
        System.out.println("\nList of Periods in a day: ");
        for (Integer var: list1){
            System.out.println(var);
        }
        ArrayList<Double> list2=obj.createDoubleList();
        System.out.println("\nStart time of each Period: ");
        for (double var: list2){
            System.out.println(var);
        }
    }
}
