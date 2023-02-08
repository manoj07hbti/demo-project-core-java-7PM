package class_and_object;

public class State {
    String name="Uttar Pradesh";
    String Capital="Lucknow";
    String Chiefminister="Yogi Adityanath";
    int District=75;

    public static void main(String[] args) {
        State obj1=new State();
        System.out.println("Name is : " +obj1.name);
        System.out.println("Capital is : " +obj1.Capital);
        System.out.println("C.M is : " +obj1.Chiefminister);
        System.out.println("Totel Distric : " +obj1.District);
    }
}
