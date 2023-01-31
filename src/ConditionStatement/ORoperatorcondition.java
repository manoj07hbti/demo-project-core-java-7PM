package ConditionStatement;

public class ORoperatorcondition {
    public static void main(String args []){
        int age;
        String city;
        age=19; city="Mumbai";

        // TRUE||TRUE= TRUE//

        if(age>18 || city=="Mumbai"){

            System.out.println("Persan  is eligible for voting in Mumbai");
        }
        else{
            System.out.println("Persan is not eligible for voting in Mumbai");
        }
        //TRUE || FALSE= TRUE

         city="AGRA";

        if(age>18  || city=="Mumbai"){

            System.out.println("Persan is eligible for voting in Mumbai");
        }
         else{

             System.out.println("Persan is not eligible for voting in Munbai");
        }
        //FALSE|| FALSE= FALSE
        age=14;
         city="Pune";
         if(age>18  || city== "Mumbai"){

             System.out.println("Persan is eligiblefor voting in Mumbai");
         }
          else{
              System.out.println("Persan is not eligible for voting in Mumbai");
         }


    }




}
