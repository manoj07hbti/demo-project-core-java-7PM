package Collection;

import java.util.ArrayList;

public class demolist {
    public void createArrayList(){
        // syntax   CollectionName obj = new collectionName
        ArrayList List = new ArrayList();  // created object for arraylist
        // objName.methodName
        List.add("Java");
        List.add("Java8");
        List.add("spring boot");
        List.add(0.7);
        List.add(6448);
        List.add("added element");
        System.out.println(List.get(2));    // used to get element
        System.out.println(List.get(1));
        System.out.println("now printing all element of arraylist using for lopp");
        for (int i=0; i<List.size(); i++){
            System.out.println("printing array list in loop : "  +List.get(i));
        }

        for (Object var : List){
            System.out.println("printing array list in advanced loop : " +var);
        }
        // removing element from ArrayList
        List.remove(4);
        // after remove
        for (Object var : List){
            System.out.println("after remove : printing array list in advanced loop : " +var);
        }
    }
    public static void main(String[] args) {
        demolist obj1 = new demolist();
        obj1.createArrayList();

    }
}
