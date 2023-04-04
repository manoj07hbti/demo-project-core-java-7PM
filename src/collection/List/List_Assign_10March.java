package collection.List;

import java.util.ArrayList;

public class List_Assign_10March {

    //create Arraylist
    public void createArraylist(){

        //syntax: collectionName obj=new collectionName();

        ArrayList array=new ArrayList();   // array is object , Object created for array list
        //objName.MethodName();

        array.add(01010);  //0
        array.add("java");  //1
        array.add("meuseum");  //2
        array.add("createlogic");  //3
        array.add(4555.1525);   //4
        array.add("India");    //5
        array.add("java 8");   //6
        array.add("java detail");  //7
        array.add(121212);    //8
        array.add(5252.1212);   //9
        array.add("monday");  //10

        System.out.println(array.get(2));
        System.out.println(array.get(3));

        //print all using loop
        //loop 0 to size

        for(int i=0; i< array.size();i++){
            System.out.println("printing array list in loop" +array.get(i));

        }

        //print all ushing advance loop

        //for (datatype var: array/collection{
        // }

        for(Object var :array){
            System.out.println("print using advance loop " +var);
        }

        // removing elements form list

        array.remove(6);
        for (Object var:array){
            System.out.println("print after remove the list " +var);
        }

        // finding data in full list

        for(int i=0; i<array.size(); i++){
            if(array.get(i)=="createlogic"){
                System.out.println("element found at index : " +i);
            }
            else {
                System.out.println("element not found :" +i );
            }
        }









    }


    public static void main(String[] args) {
        List_Assign_10March obj=new List_Assign_10March();
        obj.createArraylist();


    }
}
