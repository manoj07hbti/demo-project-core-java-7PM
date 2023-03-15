package Collection.HashSet;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorExample {

    public LinkedHashSet<String> ITRExample(){
        LinkedHashSet<String> list= new LinkedHashSet<>();

        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("Java");


        Iterator itr= list.iterator();

        while (itr.hasNext()){
            System.out.println("Iterator Example : "+itr.next());
        }
        return list;
    }

    public static void main(String[] args) {
        IteratorExample obj= new IteratorExample();
        obj.ITRExample();

    }
}
