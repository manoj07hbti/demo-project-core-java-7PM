package collaction;

import java.util.ArrayList;
import java.util.Objects;

public class Array_List {

    public void creatarraylist() {

        //SYNTAX Collaction name obj name = new collaction name
        ArrayList list = new ArrayList();

        //obj name.method name
        list.add("Element 1");//INDEX 0
        list.add("Element 2");//INDEX 1
        list.add("Element 3");//INDEX 2
        list.add("Element 4");//INDEX 3
        list.add("Element 5");//INDEX 4
        list.add("Element 6");//INDEX 5
        list.add("Element 7");//INDEX 6
        list.add("Element 8");//INDEX 7
        list.add("Element 9");//INDEX 8
        list.add("Element 10");//INDEX 9

        for (int i=0; i< list.size(); i++){
        System.out.println("printing in for loop : " + list.get(i));
    }
    }

    public static void main(String[] args) {

        Array_List obj=new Array_List();

        obj.creatarraylist();
    }
}
