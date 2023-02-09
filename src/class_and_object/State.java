package class_and_object;

public class State {


    // Data Members //

    String name;
    int no;
    int pinNo;
    String dist;

    // parameterzied constructor //

    public State(String name, int no, int pinNo, String dist) {
        this.name = name;
        this.no = no;
        this.pinNo = pinNo;
        this.dist = dist;
    }
    public static void main(String[]args){


        // ClassName objName= new Classname(param1, param2.....); //

        State object =new State("Utter Pradesh",83,283204,"Firozabad");

        System.out.println("State Name "+object.name +": Population Number "+object.no +": Pin Code Number "+object.pinNo +": " +
                "District Is "+object.dist);




    }
}
