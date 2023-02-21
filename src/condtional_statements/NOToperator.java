package condtional_statements;

public class NOToperator {
    public static void main(String[] args) {


        String country="INDIA";

        if(!(country=="INDIA")){

            System.out.println("Person is INDIAN");
        }
        else {

            System.out.println("Person is FOREIGNER");
        }

        int age= 9;

        if(!(age<18)){

            System.out.println("Person is eligible for voting");
        }
        else {

            System.out.println("Person is not eligible for voting");
        }
    }
}
