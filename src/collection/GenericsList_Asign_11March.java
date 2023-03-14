package collection;

import java.util.ArrayList;

public class GenericsList_Asign_11March {

    public ArrayList CreateStringList(){

        // syntax :Collection <DataType> objName= new Collection();
         ArrayList <String> StringList= new ArrayList(); // collection name is ArrayList and Obj name is StringLIst
        StringList.add("INDIA");
        StringList.add("Tokyo");
        StringList.add("Japan");
        StringList.add("china");
        StringList.add("Java");
        StringList.add("Java");

        return  StringList;
    }

    //create integer

    public ArrayList CreateIntegerList(){
        ArrayList <Integer> IntegerList=new ArrayList();
        IntegerList.add(233);
        IntegerList.add(124);
        IntegerList.add(1212);
        IntegerList.add(1142);

        return IntegerList;
    }

    //create double
    public ArrayList CreateDoubleList(){
        ArrayList <Double> DoubleList=new ArrayList();
        DoubleList.add(1212.2020);
        DoubleList.add(121221.11221);
        DoubleList.add(14.1212);
        DoubleList.add(4545.12);
        return DoubleList;


    }




    public static void main(String[] args) {
        GenericsList_Asign_11March obj=new GenericsList_Asign_11March();
        ArrayList <String> list=obj.CreateStringList();
        for (String var:list){
            System.out.println("This is list " +var);
        }

        ArrayList <Integer> IntegerArrayList=obj.CreateIntegerList();
        for(int i=0; i< IntegerArrayList.size(); i++){
            System.out.println("This is Integer list " +IntegerArrayList.get(i));
        }

        ArrayList <Double> Double=obj.CreateDoubleList();
        for(int i=0; i<Double.size(); i++){
            System.out.println("This is double list : " +Double.get(i));
        }




    }
}
