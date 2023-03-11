package collaction;

import java.util.ArrayList;
import java.util.Objects;

public class Array_List {

    public void creatarraylist() {

        ArrayList list = new ArrayList();

        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");
        list.add("Element 6");
        list.add("Element 7");
        list.add("Element 8");
        list.add("Element 9");
        list.add("Element 10");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("printing in for loop : " + list.get(i));
        }
    }

    public static void main(String[] args) {

        Array_List obj=new Array_List();

        obj.creatarraylist();
    }
}
