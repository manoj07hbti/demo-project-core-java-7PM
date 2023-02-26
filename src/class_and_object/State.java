package class_and_object;

public class State {

    String Name = "U.P.";
    long Population = 241360000l;
    String CM_Name = "Yogi ji";

    public static void main(String[] args) {

        State obj = new State();
        System.out.println("State Name " +obj.Name);
        System.out.println("Population No. " +obj.Population);
        System.out.println("CM Name " +obj.CM_Name);

        State obj1 = new State();
        System.out.println("State Name obj1 " +obj1.Name);
        System.out.println("Population No. obj1 " +obj1.Population);
        System.out.println("CM Name obj1 " +obj1.CM_Name);


    }
}
