package collepsionMethod.arrayList;

import java.util.ArrayList;

public class CreateList {
    // 1- we use the collection for store(manage) different type data
    //List Collection 

    public void createlist(){

        ArrayList list = new ArrayList();
// 2- add 10 elements
        // link list print a sequence line order without any changing
        // and both data are add in link list
        list.add("paramvir singh");// Add method is use for add particular value in the list
        list.add(25);              // Add is the method of list collection only
        list.add("aman");
        list.add("gourav");
        list.add("raj kumar");
        list.add(35);
        list.add("ravi");
        list.add("pawam kumar");
        list.add("kumkum");
        list.add("durvesh");

        System.out.println(list.get(1));
        // use of get method for find (print) index value of the list, we can call it
        // we don't want to print any index then use this command

        list.remove(5);
        // Size method is use for find (print) all index value size of list collection
        // how to compare data from list index like find kumkum

        for(int i=0; i<list.size(); i++){
            if (list.get(i)=="kumkum"){
                System.out.println("element found at index"+i);
            }else {
                System.out.println("Element not found at index");
            }
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
