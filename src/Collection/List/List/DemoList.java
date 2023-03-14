package Collection.List.List;

import java.util.ArrayList;

public class DemoList {

    int i=0;
    public void CreateArrayList(){
        ArrayList list = new ArrayList();

        list.add("Praveen");
        list.add("Ajeet");
        list.add(32);
        list.add(32.67);
        list.add("Count");
        list.add(675);
        list.add(32.67);
        list.add("Spring Boot");
        list.add("Collection");
        list.add("Threats");

        //Printing Standard
        System.out.println("Printing Single Element : "+list.get(4));

        //Printing Using for Loop
        for(i=0;i<list.size();i++){
            System.out.println("Printing ArrayList Using for Loop : "+list.get(i));
        }
        i=0;
        while(i<list.size()){
            System.out.println("Printing Collection.Collection.List.List Using While Loop : "+list.get(i));
            i++;
        }
        i=0;
        do{
            System.out.println("Printing Using Do While Loop : "+list.get(i));
            i++;
        }
        while (i<list.size());

        for(Object var : list){
            System.out.println("Printing using Advanced for Loop : "+var);
        }
    }

    public static void main(String[] args) {
        DemoList obj = new DemoList();
        obj.CreateArrayList();
    }
}
