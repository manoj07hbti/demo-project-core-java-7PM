package condtional_statements;

public class ORoperator {
    public static void main(String[] args) {

        //if (condition1 || condition2)
        //
        //	OR----> ||                 TRUE||TRUE= TRUE (1+1=1)
        //				               TRUE||FALSE=TRUE (1+0=1)
        //				               FALSE||TRUE=TRUE (0+1=1)
        //				               FALSE|| FALSE= FALSE(0+0=0)


        int age=18;
        String city="Agra";

        //TRUE||TRUE= TRUE (1+1=1)

        if(age>=18 || city=="Agra"){

            System.out.println("Person is eligible for voting in Agra");
        }
        else {

            System.out.println("Person is not eligible for voting in Agra");
        }

        age=18;
        city="Delhi";

        //TRUE||FALSE=TRUE (1+0=1)

        if(age>=18 || city=="Agra"){

            System.out.println("Person is eligible for voting in Agra");
        }
        else {

            System.out.println("Person is not eligible for voting in Agra");
        }


        age=15;
        city="Agra";

        //FALSE||TRUE=TRUE (0+1=1)

        if(age>=18 || city=="Agra"){

            System.out.println("Person is eligible for voting in Agra");
        }
        else {

            System.out.println("Person is not eligible for voting in Agra");
        }

        age=15;
        city="Firozabad";

        //FALSE|| FALSE= FALSE(0+0=0)

        if(age>=18 || city=="Agra"){

            System.out.println("Person is eligible for voting in Agra");
        }
        else {

            System.out.println("Person is not eligible for voting in Agra");
        }





    }
}
