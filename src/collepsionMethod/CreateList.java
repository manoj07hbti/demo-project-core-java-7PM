package collepsionMethod;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CreateList {
    // 1- create a List

    public void createlist(){

        ArrayList list = new ArrayList();
// 2- add 10 elements
        list.add("paramvir singh");
        list.add(25);
        list.add("aman");
        list.add("gourav");
        list.add("raj kumar");
        list.add("karan");
        list.add("ravi");
        list.add("pawam kumar");
        list.add("kumkum");
        list.add("durvesh");

        System.out.println(list.get(1));
        // 3- print all using for loop

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // 4- print all using while loop
        int j = 0;
        while (j<list.size()){
            System.out.println(list.get(j));
            j++;
        }
        // 5- print all using do while loop

        int k=0;
        do{
            System.out.println(list.get(k));
            k++;
        } while (k< list.size());




    }
    public static void main(String [] args){
        CreateList obj =new CreateList();
        obj.createlist();
    }
}
