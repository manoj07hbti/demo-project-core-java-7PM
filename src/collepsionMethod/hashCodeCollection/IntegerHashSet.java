package collepsionMethod.hashCodeCollection;

import java.util.HashSet;

public class IntegerHashSet {

    public HashSet<Integer> createIntegerhashset() {

        HashSet<Integer> IntegerHashSet = new HashSet<>();

        IntegerHashSet.add(35);
        IntegerHashSet.add(36);
        IntegerHashSet.add(37);
        IntegerHashSet.add(38);
        IntegerHashSet.add(39);
        System.out.println("printing is " + IntegerHashSet.size());

        return IntegerHashSet;
    }
    public HashSet<Double> DoubleHashSet(){
       HashSet<Double> DoubleHashSet =new HashSet<>();

       DoubleHashSet.add(25143.25);
       DoubleHashSet.add(2535.23);
       DoubleHashSet.add(24587.25);
       return DoubleHashSet;
    }

    public static void main(String[] args){

        IntegerHashSet obj =new IntegerHashSet();
        HashSet<Integer> Set = obj.createIntegerhashset();
        for(Integer var: Set){
            System.out.println("Element of set is "+var);
        }
        HashSet<Double> doubles= obj.DoubleHashSet();
        for(Double var: doubles ){
            System.out.println("print double "+ var);
        }
    }
}
