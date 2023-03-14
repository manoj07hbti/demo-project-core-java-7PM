package Collection.List.List;

import java.util.ArrayList;

public class DoubleArrayList {

    public ArrayList <Double> CreateList(){
        ArrayList <Double> list = new ArrayList();

        list.add(45.786);
        list.add(563.8764);
        list.add(563.876);
        return list;
    }

    public static void main(String[] args) {
        DoubleArrayList obj= new DoubleArrayList();
        ArrayList<Double> var =obj.CreateList();

        for(Double var1 : var){
            System.out.println("Printing Generic Collection.Collection.List.List : "+var1);
        }
    }
}
