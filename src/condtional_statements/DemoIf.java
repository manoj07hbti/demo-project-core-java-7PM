package condtional_statements;

public class DemoIf {

    public static void main(String[] args) {

        // if(expression or condition ){
        //          CODE
        //    }

        int age; // declared age variable of integer type

        age=16;

        if(age>18){

            System.out.println("Person is eligible for voting "+age);
        }

        if(age<18){

            System.out.println("Person is not eligible for voting "+age);
        }

        String city="PUNE";

        if(city=="AGRA"){

            System.out.println("Person belongs to AGRA");
        }

        if (city != "AGRA"){

            System.out.println("Person belongs to some other city ");
        }

    }
}
