package collepsionMethod.Linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public HashSet<String> createLinkedHashSet(){

        HashSet<String> set= new HashSet<>();
        set.add("arman");
        set.add("malik");
        set.add("paramvir");
        set.add("singh");
        System.out.println("size of set is "+ set.size());
        return set;
    }
    public void LinkedHashSet(){
        LinkedHashSet<String> Linkedhashset =new LinkedHashSet<>();
        Linkedhashset.add("agra");
        Linkedhashset.add("Delhi");
        Linkedhashset.add("kanpur");
        Linkedhashset.add("lucknow");
        for(String var: Linkedhashset){
            System.out.println("Linked set is "+var);
        }
    }
    public static void main(String []args){
        LinkedHashsetDemo obj =new LinkedHashsetDemo();
        HashSet<String> n=obj.createLinkedHashSet();
        for(String var: n){
            System.out.println("print String list is "+var);
        }
        obj.LinkedHashSet();
    }
}
