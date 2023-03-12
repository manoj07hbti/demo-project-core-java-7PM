package hashset;

import java.util.HashSet;

public class Demohashset

    public static void main(String[] args) {

      Demohashset obj =new Demohashset();

    }public void demo() {

    HashSet<String> name = new HashSet<>();

    name.add("imran khan");
    name.add("imran khan");
    name.add("imran khan");
    name.add("Arman khan");
    name.add("Arman khan");
    name.add("Arman khan");
    name.add("Manoj kumar");
    name.add("Manoj kumar");
    name.add("Manoj kumar");
    for (String var : name) {
        System.out.println("Printing name out of duplicates:" + var);
    }


   }


}


