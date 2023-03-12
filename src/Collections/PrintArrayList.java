/* Program to print collection of array list using different Loops
   Program Name: PrintArrayList.java
   Program Date: 11-March-2023
   Program Auth: Aanchal Atre
*/
package Collections;

import java.util.ArrayList;

public class PrintArrayList {

    public void arrayList() {
        ArrayList arrlist = new ArrayList();

        arrlist.add("English");
        arrlist.add("Hindi");
        arrlist.add("Maths");
        arrlist.add("EVS");
        arrlist.add("Computers");
        arrlist.add("Marathi");
        System.out.println("\nPrinting list of subjects using For Loop: ");
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }
        int j = 0;
        System.out.println("\nPrinting list of subjects using While Loop: ");
        while (j < arrlist.toArray().length) {
            System.out.println(arrlist.get(j));
            j++;
        }
        int i = 0;
        System.out.println("\nPrinting list of subjects using DoWhile Loop: ");
        do {
            System.out.println(arrlist.get(i));
            i++;
        } while (i < arrlist.toArray().length);
    }

    public static void main(String[] args) {
        PrintArrayList obj = new PrintArrayList();
        obj.arrayList();
    }
}
