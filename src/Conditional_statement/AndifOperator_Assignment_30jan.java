package Conditional_statement;

public class AndifOperator_Assignment_30jan {

    public static void main(String[] args) {
        ///Assignmet 30jan
        //Age should be greater than 18 and if city is in (DELHI , MUMBAI, CHENNAI, BANGALORE) then print Metro City

        int age = 19;
        String city;
        city = "MUMBAI";



        city="Delhi";
        if (age > 18 & city == "Delhi" ) {
            System.out.println("AGE =" +age + "CITY =" +city);
            System.out.println("Person is eligable for voting in Metro city");
        }
        city="MUMBAI";
        if (age>18 || city=="MUMBAI"){
            System.out.println("AGE = "+age +"CITY =" +city);
            System.out.println("Person is  eligable for voting in Metro city");
        }
        city = "Chennai";
        if(age>18 || city=="Chennai"){
            System.out.println("AGE =" +age +"CITY =" +city);
            System.out.println("Person is eligable for voting in Metro city ");
        }
        city = "BANGLORE";
        if(age>18 || city=="BANGLORE"){
            System.out.println(" AGE =" +age +"CITY =" +city);
            System.out.println("Person is eligable for voting in Metro city ");
        }
        age=15;

        if(age>15 || city=="BANGLORE"){
            System.out.println("AGE = "+age +"CITY =" +city);
            System.out.println("Person is not eligable for voting in Metro city ");
        }





            }
}
