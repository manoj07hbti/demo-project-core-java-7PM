package collaction;

import java.util.ArrayList;

public class Genericlist {
    public ArrayList<String> creatStringlist(){

        ArrayList <String> StringArraylist =new ArrayList<>();

        StringArraylist.add("Dell");
        StringArraylist.add("Lenovo");
        StringArraylist.add("HP");
        StringArraylist.add("Acer");

        return StringArraylist;
    }

    public ArrayList<Integer> intergerarraylist(){

        ArrayList<Integer> integerArrayList=new ArrayList<>();

        integerArrayList.add(23);
        integerArrayList.add(45);
        integerArrayList.add(86);
        integerArrayList.add(88);

        return integerArrayList;
    }

    public static void main(String[] args) {

        Genericlist obj = new Genericlist();
        ArrayList<String> list = obj.creatStringlist();
        for (String var : list) {
            System.out.println("this is list : " + var);
        }
        ArrayList<Integer> integerArrayList=obj.intergerarraylist();

        for (Integer var : integerArrayList){
            System.out.println("this is integer list : " +var);
        }



    }
}
