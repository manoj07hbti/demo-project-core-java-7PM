package parameterised_constructor;

public class College {

    //Properties of College//

    String name;
    String city;
    int fee;

    //Parameterised Constructor//
    public College(String name, String city, int fee) {
        this.name = name;
        this.city = city;
        this.fee = fee;
    }

    public static void main(String[] args) {

        //Storing data of different colleges by the use of parameterised constructor//

        //SYNTAX : ClassName objName = new ClassName(parameter1+parameter2+parameter3); //

        College college1 = new College("R.B.S College", "Agra", 90506);
        System.out.println("College name :" + college1.name + "  City :" + college1.city + "  Fee :" + college1.fee);

        College college2 = new College("G.L Bajaj College", "Noida", 75999);
        System.out.println("College name :" + college2.name + "  City :" + college2.city + "  Fee :" + college2.fee);

        College college3 = new College("Uttam College", "Agra", 88657);
        System.out.println("College name :" + college3.name + "  City :" + college3.city + "  Fee :" + college3.fee);

    }
}
