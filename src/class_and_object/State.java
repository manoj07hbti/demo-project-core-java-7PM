package class_and_object;

public class State {

    //Properties of States//

    String statename = "Utttar Pradesh";
    double population = 199812341;
    int dictrict = 75;
    String language = "Hindi";

    public static void main(String[] args) {
        //SYNTAX : ClassName objName new ClassName();//
        //obj printing : +obj1.name;//
        State obj1 = new State();
        System.out.println("Printing state name :" + obj1.statename);
        System.out.println("Printing population :" + obj1.population);
        System.out.println("Printing district :" + obj1.dictrict);
        System.out.println("Printing language :" + obj1.language);
    }

}
