package condtional_statements;

public class ANDoperator {

    public static void main(String[] args) {

        int age;
        String city;

        age=19; city="AGRA";
//TRUE & TRUE= TRUE
        if(age>18 & city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA");
        }
        else {

            System.out.println("Person is NOT eligible for voting in AGRA");
        }

//TRUE & FALSE =FALSE

        city="DELHI";

        if(age>18 & city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA");
        }
        else {

            System.out.println("Person is NOT eligible for voting in AGRA : TRUE & FALSE =FALSE");
        }

//FALSE & TRUE =FALSE

        age=15;
        city="AGRA";

        if(age>18 & city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA");
        }
        else {

            System.out.println("Person is NOT eligible for voting in AGRA : FALSE & TRUE =FALSE");
        }

//FALSE & FALSE= FALSE

    age=14;
    city="DELHI";

        if(age>18 & city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA");
        }
        else {

            System.out.println("Person is NOT eligible for voting in AGRA : FALSE & FALSE= FALSE ");
        }



    }
}
