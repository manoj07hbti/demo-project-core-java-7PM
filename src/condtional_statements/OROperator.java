package condtional_statements;

public class OROperator {

    public static void main(String[] args) {

        int age;
        String city;

  // TRUE||TRUE= TRUE
     age=19;
     city="AGRA";

     if(age>18 || city=="AGRA" ){

         System.out.println("Person is eligible for voting in AGRA : TRUE||TRUE= TRUE");
     }
     else {
         System.out.println("Person is NOT eligible for voting in AGRA");
     }

//TRUE || FALSE= TRUE
      city="DELHI";

        if(age>18 || city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA : TRUE || FALSE=TRUE");
        }
        else {
            System.out.println("Person is NOT eligible for voting in AGRA");
        }

// FALSE||TRUE=TRUE

        age=15;
        city="AGRA";

        if(age>18 || city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA : FALSE||TRUE=TRUE");
        }
        else {
            System.out.println("Person is NOT eligible for voting in AGRA");
        }

//FALSE|| FALSE= FALSE

        age=13;
        city="DELHI";

        if(age>18 || city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA ");
        }
        else {
            System.out.println("Person is NOT eligible for voting in AGRA: FALSE|| FALSE= FALSE");
        }

    }
}
