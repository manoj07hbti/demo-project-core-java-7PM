package condtional_statements;

public class ANDoperator {
    public static void main(String[] args) {

        int age = 18;
        String city = "Agra";

        //TRUE & TRUE= TRUE (1X1=1)   // AND(&) operator cymbal is &

        if (age >= 18 & city == "Agra") {

            System.out.println("Person is eligible for voting in Agra");

        } else {

            System.out.println("Person is not eligible for voting in Agra");
        }

        //TRUE & FALSE=FALSE(1X0=0)

        age = 18;
        city = "Delhi";

        if (age >= 18 & city == "Agra") {

            System.out.println("Person is eligible for voting in Agra");

        } else {

            System.out.println("Person is not eligible for voting in Agra");
        }

        //FALSE& TRUE =FALSE(0X1=0)

        age = 16;
        city = "Agra";

        if (age >= 18 & city == "Agra") {

            System.out.println("Person is eligible for voting in Agra");

        } else {

            System.out.println("Person is not eligible for voting in Agra");
        }
        //FALSE&FALSE= FALSE(0X0=0)

        age = 16;
        city = "Delhi";

        if (age >= 18 & city == "Agra") {

            System.out.println("Person is eligible for voting in Agra");

        } else {

            System.out.println("Person is not eligible for voting in Agra");
        }


    }
}
