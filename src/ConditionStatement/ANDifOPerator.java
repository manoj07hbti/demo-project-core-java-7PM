package ConditionStatement;

public class ANDifOPerator {
    public static void main(String args[]){
        int age;
        String city;
        age=19; city="PUNE";

        if ( age>18 & city=="PUNE") {

            //TRUE & TRUE= TRUE//

            System.out.println("Persan is eligible for votingin  in Metro city");
        }else{
            System.out.println("Person is not eligible for voting in Metro city");
        }
        //TRUE &  FALSE= FALSE//
        age=19;
        city="DELHI";

        if(age>18 & city=="Chennai") {

            System.out.println("Persan is eligible for voting in Merto city");
        }else{
            System.out.println("Persan is  not eligible for voting in Metro city ");
        }
        //FALSE & TRUE=FALSE//

         age=16;
        city="Raipur";
        if(age>18  & city=="Raipur"){

            System.out.println("Persan is eligible for voting in Metro city");
        }else{

            System.out.println("persan is  not eligible for voting in Metro city");
        }
        int marks=33;

        if(marks>33 & marks<44 ){

            System.out.println("clear exam with 3rd devision");
        }
        else{

            System.out.println("clear exam not with 3rd devision");
        }





    }











}
