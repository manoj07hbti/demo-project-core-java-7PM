package collepsionMethod.arrayList;

import java.util.*;
public class DoubleArray {
    // Q1: why do we use Array list
    // ans: Generic list collection is use for print and store different data like as Integer and String, Double
    // and also print sequence(unique) order

    public ArrayList<String> stringsArraylist() {
        // when we use String datatype then we can not use other data in the collection
        // then we know that we can not use integer value of this method

        ArrayList<String> StringArrayList = new ArrayList<>();

        StringArrayList.add("java");
        StringArrayList.add("window");
        StringArrayList.add("uttar pradesh");
        StringArrayList.add("tamilnadu");
        StringArrayList.add("maharastra");
        StringArrayList.add("pune");

        return StringArrayList;
    }
    public ArrayList<Integer> integerArrayList(){

        ArrayList<Integer> integersArrayList = new ArrayList<>();

        integersArrayList.add(25);
        integersArrayList.add(36);
        integersArrayList.add(85);
        integersArrayList.add(45);

        return integersArrayList;
    }
    public ArrayList<Double> DoublesArraylist(){
        ArrayList<Double> DoubleArrayList= new ArrayList<>();
        DoubleArrayList.add(253.23);
        DoubleArrayList.add(251.01);
        DoubleArrayList.add(785.45);
        DoubleArrayList.add(9856.26);

        return DoubleArrayList;
    }

    public static void main(String[] args){
        DoubleArray obj =new DoubleArray();
        ArrayList<String> list = obj.stringsArraylist();

        for(String var: list){
            System.out.println("this is list of :"+var);
        }

        ArrayList<Integer> integerlist =obj.integerArrayList();
        for(int i=0; i< integerlist.size(); i++){ 
            System.out.println("this is integer list : "+integerlist.get(i));
        }
        ArrayList<Double> DoubleList = obj.DoublesArraylist();
        for(int j = 0; j< DoubleList.size(); j++){
            System.out.println("Double Array List : "+DoubleList.get(j));
        }


    }



}
