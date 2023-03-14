package collection;

import java.util.ArrayList;

public class DemoList_1 {

    //Create array list collection

    public void CreateArrayList() {
        //SYNTAX CollectionName ObjName =new CollectionName():
        ArrayList list = new ArrayList();// object created for array list
        //objName.MethodName();

        list.add("Java");
        list.add("Spring Booting");
        list.add("36");
        list.add("46467.77");
        list.add("Aman Dev");


        System.out.println(list.get(2));
        System.out.println(list.get(3));

        //loop 0 to size

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Printing Array list in Loop :" + list.get(i));
        }

        //loop Advanced for loop size data type :ObjectClass

        for (Object var : list) {
            System.out.println("Printing using advanced Loop :" + var);
        }
        //remove data from array list
        list.remove(3);
        for (Object var : list) {
            System.out.println("Printing using After remove 3 index advanced Loop :" + var);
        }

    }

    public static void main(String[] args) {
        DemoList_1 obj = new DemoList_1();
        obj.CreateArrayList();

    }
}
