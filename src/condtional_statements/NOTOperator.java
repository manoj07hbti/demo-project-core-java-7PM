package condtional_statements;

public class NOTOperator {

    public static void main(String[] args) {


        String country="INDIA";

        if( !(country== "INDIA")){

            System.out.println("Person is Indian ..");
        }
        else {

            System.out.println("Person is Foreigner.. ");
        }

        int age=19;

        if(  !(age>18)){
            System.out.println("eligible for voting ");
        }
        else {
            System.out.println("NOT eligible for voting ...");
        }


        if(  !(age<18)){
            System.out.println("NOT eligible for voting ");
        }
        else {
            System.out.println(" eligible for voting ...");
        }


    }
}
