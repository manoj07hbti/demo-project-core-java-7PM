package Collection;

import java.util.ArrayList;

public class assignment1_ArrayList {
    public void createArrayList(){
        ArrayList listA = new ArrayList();
        listA.add("element1");
        listA.add("java");
        listA.add("Java8");
        listA.add("spring boot");
        listA.add(0.7);
        listA.add(6448);
        listA.add(564);
        listA.add(6456);
        listA.add("programming");
        listA.add("c++");

        for (int i=0; i<listA.size(); i++){
            System.out.println("printing element at index "  +i + " using for loop : " +listA.get(i));
        }
        int j=0;
        while (j<listA.size()){
            System.out.println("printing element at index "  +j + " using while loop : " +listA.get(j));
            j++;
        }
        int k=0;
        do{
            System.out.println("printing element at index "  +k + " using do while loop : " +listA.get(k));
            k++;
        }while (k<listA.size());
    }


    public static void main(String[] args) {
        assignment1_ArrayList obj1 = new assignment1_ArrayList();
        obj1.createArrayList();

    }
}
