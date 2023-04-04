package collection.Hashset;

import java.util.HashSet;

public class Hashset_Assign13March {
    // assignment "create string Hashset
    public HashSet<String> createset(){
        //class name objname=new classname();

        HashSet<String> set=new HashSet<>();
        set.add("Japan");
        set.add("Tokyo");
        set.add("Korea");
        set.add("Japan");
        set.add("Tokyo");
        set.add("Korea");

        System.out.println("size of set is , its hides duplicate element"+set.size());
        return set;
    }

    //// assignment "create Integer Hashset
    public HashSet<Integer> RollNum(){
        HashSet<Integer> RollNum= new HashSet<>();
        RollNum.add(12);
        RollNum.add(22);
        RollNum.add(33);
        RollNum.add(22);
        RollNum.add(33);
        System.out.println("size of integer is, hashset hides the duplicate value"+RollNum.size());
        return RollNum;


    }

    // assignment "create double Hashset

    public HashSet<Double> salary(){
        HashSet<Double> Salary=new HashSet<>();
        Salary.add(1254.25);
        Salary.add(3253.225);
        Salary.add(8524.25);
        Salary.add(8524.25);
        Salary.add(8524.25);
        return Salary;

    }
    public static void main(String[] args) {
        Hashset_Assign13March obj=new Hashset_Assign13March();
       HashSet<String> set= obj.createset();
       for (String var:set ){
           System.out.println("Elements set is, its not repeat dublicate element "+var);
       }

        HashSet<Integer> RollNum=obj.RollNum();
       for (Integer var:RollNum){
           System.out.println("WIthout duplicate roll num is "+var);
       }
       HashSet<Double>Salary=obj.salary();
       for (double var:Salary){
           System.out.println("print without dublicate value " +var);
       }


    }
}
