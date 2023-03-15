package collepsionMethod;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.*;
public class DoubleArray {
    public ArrayList<String> DoubleArraylist() {

        ArrayList<String> StringArrayList = new ArrayList<>();

        StringArrayList.add("java");
        StringArrayList.add("window");
        StringArrayList.add("uttar pradesh");
        StringArrayList.add("tamilnadu");
        StringArrayList.add("maharastra");
        StringArrayList.add("pune");

        return StringArrayList;
    }
    public ArrayList<Integer> DoubleArrayListinteger(){

        ArrayList<Integer> integersArrayList = new ArrayList<>();

        integersArrayList.add(25);
        integersArrayList.add(36);
        integersArrayList.add(85);
        integersArrayList.add(45);

        return integersArrayList;
    }

    public static void main(String[] args){
        DoubleArray obj =new DoubleArray();
        ArrayList<String> list = obj.DoubleArraylist();

        for(String var: list){
            System.out.println("this is list of "+var);
        }

        ArrayList<Integer> integerlist =obj.DoubleArrayListinteger();
        for(int i=0; i< integerlist.size(); i++){
            System.out.println("this is integer list "+integerlist.get(i));
        }


    }


}
