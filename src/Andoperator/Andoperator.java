package Andoperator;

public class Andoperator {

    public static void main(String[] args) {

        int age;
        String city;

        age = 20;
        city = "BANGLORE";

        if (age > 18 & city == "BANGLORE") {

            System.out.println("person is eligible for voting in metro city");
        } else {

            System.out.println("person is not eligible for voting in metro city");
        }



        city = "DELHI";
        if (age > 20 & city == "CHENNAI") {

            System.out.println("person is eligible for voting in metro city");
        } else {

            System.out.println("person is not eligible for voting in metro city");
        }


        age = 16;
        city = "CHENNAI";
        if (age >18 & city == "CHENNAI") {

            System.out.println("person is eligible for voting in metro city");
        }

        else{

            System.out.println("person is not eligible for voting in metro city");
        }


        city="DELHI";
        if(age>18 & city=="BANGLORE"){

            System.out.println("person is eligible for voting in metro city");
        }

        else{

            System.out.println("person is not eligible for voting in metro city");
        }







    }
}
