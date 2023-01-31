package conditional_statements;

public class If_AND_operator_OR_OPERATOR {

    public static void main(String[] args) {
        // 1.Write a program to check age and city of voter
        // :Age should be greater than 18 and if city is in (DELHI , MUMBAI , CHENNAI , BANGALORE) then print metro city//
        // Person is eligible for voting in Metro city//
        // Person is not eligible for voting in Metro city//

        int age;
        String city;

        age = 19;
        city = "DELHI";
        if (age > 18 & city == "DELHI") {
            System.out.println("Person is eligible for voting in Metro city");
        } else {
            System.out.println("Person is not eligible for voting in Metro city");
        }

         //MUMBAI//
        age = 20;
        city = "MUMBAI";
        if (age > 18 & city == "MUMBAI") {
            System.out.println("Person is eligible for voting in Metro city");
        } else {
            System.out.println("Person is not eligible for voting in Metro city");
        }
        //CHANNAI//
        age = 21;
        city = "CHANNAI";
        if (age > 18 & city == "CHANNAI") {
            System.out.println("Person is eligible for voting in Metro city");
        } else {
            System.out.println("Person is not eligible for voting in Metro city");
        }
        //BANGALORE//
        age = 22;
        city = "BANGALORE";
        if (age > 18 & city == "BANGALORE") {
            System.out.println("Person is eligible for voting in Metro city");
        } else {
            System.out.println("Person is not eligible for voting in Metro city");
        }



    }
}
