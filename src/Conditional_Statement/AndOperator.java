package Conditional_Statement;

public class AndOperator {
    public static void main(String[] args) {

        int Age=19;
        String City="Delhi";
        String City2="Banglore";
        String City3="Chennai";
        String City4="Mumbai";

        if (Age>18 & City=="Delhi" & City2=="Banglore" & City3=="Chennai" & City4=="Mumbai"){
            System.out.println("Person is eligible for voting in Metro city");

        }
        else {
            System.out.println("Person is not eligible for voting in metro city");

        }


        int Marks1=35;
        int Marks2=44;
        int Marks3=60;
        String Section1="Art";
        String Section2="Science";

        if (Marks1>33 & Section1=="Art" & Section2=="Science"){

                System.out.println("Student is passed");
        }
        else {
            System.out.println("Student is not passed");
        }
        if (Marks2>43 & Section1=="Art"){
            System.out.println("Student is passed with 2nd devision");
        }
        else {
            System.out.println("Student is passed with 2nd devision");
        }

        if (Marks3>60 & Section2=="Science"){
            System.out.println("Student is passed with 1st devision");
        }















        }
}