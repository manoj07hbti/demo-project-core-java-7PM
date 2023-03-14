package collection;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionAssignment {

    public void CreateList() {

        //Assignment 1.Create a list 10 elements and printing by all types of loops
        // 1.for loop , 2. while loop, 3. do while loop, 4. advanced for loop

        //SYNTAX CollectionName ObjName =new CollectionName():
        ArrayList create = new ArrayList();// object created for array list
        //objName.MethodName();

        //Adding 10 elements
        create.add("Aman Dev");
        create.add("Manoj Sir");
        create.add("Gaurav Dev");
        create.add("283204");
        create.add("6397301662");
        create.add("Anmol");
        create.add("Core Java");
        create.add("Web Developer");
        create.add("Smartphones");
        create.add("Google");

        //Printing all elements by for Loop

        for (int i = 0; i < create.size(); i++) {
            System.out.println("Printing all elements by using For Loop :" + create.get(i));
        }

        //Printing all elements by while Loop

        int i = 0;
        while (i < create.size()) {
            System.out.println("Printing all elements by using While Loop :" + create.get(i));
            i++;
        }

        //Printing all elements by do while loop

        int j = 0;
        do {
            System.out.println("Printing all elements by Do While Loop :" + create.get(j));
            j++;
        } while (j < create.size());

        // Printing all elements by advanced loop

        for (Object var : create) {
            System.out.println("Printing all elements by Advanced Loop :" + var);
        }

    }

    public static void main(String[] args) {
        CollectionAssignment obj = new CollectionAssignment();
        obj.CreateList();
    }


}




