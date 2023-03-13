package collection.list;

import java.util.ArrayList;

public class DemoList {


    // create ArrayList collection

    public void createArrayList(){

        //SYNTAX   CollectionName objName= new CollectionName();

        ArrayList list = new ArrayList();// object created for ArrayList
        // objName.MethodName();

        list.add("Java"); // 0 INDEX
        list.add("Java8");// 1 INDEX
        list.add("Spring Boot");// 2 INDEX
        list.add(33);// 3 INDEX
        list.add(34543.67);// 4 INDEX
        list.add("Microservice");// 5 INDEX
        System.out.println(list.get(2));
        System.out.println(list.get(0));

        // loop  0 to size

        for(int i=0; i<list.size(); i++){

            System.out.println("Printing ArrayList in Loop: "+list.get(i));
        }


        for(Object var : list){

            System.out.println("Printing using Advanced Loop : "+var);
        }

        // removing elements from ArrayList

        list.remove(4);

        for(Object var : list){

            System.out.println("AFTER REMOVE : Printing using Advanced Loop : "+var);
        }

    }


    public static void main(String[] args) {

        DemoList obj= new DemoList();
        obj.createArrayList();

    }
}
