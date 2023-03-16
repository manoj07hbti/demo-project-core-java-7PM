package List;

import java.util.ArrayList;

public class Create_list {

    // 1- create a List

        public static void main(String[] args){

            Create_list obj = new Create_list();

            obj.createlist();
        }

    public void createlist() {

        ArrayList list = new ArrayList();

        // 2- add 10 elements

        list.add("java");
        list.add("ram");
        list.add("Anil");
        list.add("Rahul");
        list.add(34);
        list.add(456);
        list.add(123.34);
        list.add(0);
        list.add("Tarun");
        list.add("Ram");

        System.out.println(list.get(3));
        System.out.println(list.get(7));

        //Loop

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Printing Arraylist in Loop "  +  list.get ( i ));

        }
        int d=0;

        while(d<list.size()){

            System.out.println(list.get(d));
            d++;
        }
            int k=0;
        do{

            System.out.println(list.get(k));
            k++;
        }while(k<list.size());

      //  remove element for array list

           list.remove(5);

        for (int i = 0; i < list.size(); i++) {

            System.out.println("  After Remove Printing Arraylist in Loop "  +  list.get ( i ));

        }

    }

    }



