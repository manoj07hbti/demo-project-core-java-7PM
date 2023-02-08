package class_and_object;

public class College {

    //Properties of Collage//
    String collegename = "GLA University";
    int establishment = 1976;
    int fee = 400000;
    String adress = "Mathura";

    public static void main(String[] args) {

        //SYNTAX : ClassName objName new ClassName();//
        //obj printing : +obj1.name;//

        College obj1 = new College();
        System.out.println("Printing College name :" + obj1.collegename);
        System.out.println("Printing Establishment :" + obj1.establishment);
        System.out.println("Printing fee :" + obj1.fee);
        System.out.println("Printing adress :" + obj1.adress);
    }

}
