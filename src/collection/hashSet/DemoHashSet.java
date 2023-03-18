package collection.hashSet;

import java.util.HashSet;

public class DemoHashSet {

    public void Person(){
        HashSet person= new HashSet();

        person.add("Ajeet");
        person.add(24);
        person.add(177);
        person.add("Ajeet");

        for(Object var: person){
            System.out.println("Person Details : "+var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        obj.Person();
    }
}
