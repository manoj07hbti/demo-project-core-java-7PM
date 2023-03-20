package collection;

import java.util.ArrayList;

public class DemoList {

    // Create A Method //

    public void arrayList(){

    // SYNTEX : CollectionName ObjName = New  CollectionName();

        ArrayList list = new ArrayList();

    // Create A Add 10 Elements //

        list.add("JAva"); // 0 Index
        list.add("Java 8"); // 1 Index
        list.add("Spring"); // 2 Index
        list.add("Spring Boot"); // 3 Index
        list.add("Frame Work"); // 4 index
        list.add("Micro Service"); // 5 Index
        list.add(785957); // 6 Index
        list.add(563475505); // 7 Index
        list.add("43433656346666"); // 8 Index
        list.add(4355.76); // 9 Index

        System.out.println("Printing single Elements : "+list.get(3));
        System.out.println("Printing Single Elements : "+list.get(6));

    //  Create For Loop //

        for (int i=0; i< list.size(); i++){
            System.out.println("Printing ArrayList In For Loop "+list.get(i));
        }
    //   Create While Loop  //
        int i=0;
        while (i<list.size()){
            System.out.println("Printing ArrayList In While Loop : "+list.get(i));
            i++;
        }
    // Create A Do While Loop //
        i=0;
        do {
            System.out.println("Printing ArrayList In Do While Loop : "+list.get(i));
            i++;
        }
        while (i<list.size());

    }

    public static void main (String[]args){

        DemoList obj = new DemoList();

        obj.arrayList();
    }
}




