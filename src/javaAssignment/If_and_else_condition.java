package javaAssignment;

public class If_and_else_condition {
    public static void main(String[] args){

        // which number is divisible by 5.

        int number;
        number=2440;
        if (number % 5==0){

            System.out.println("Number is divisible by 5.");
        }
        else{
            System.out.println("Number is not divisible by 5.");
        }

        // Q2 write a code if country is india print india and else foreigner

        String countryname;
        countryname= "america";

        if (countryname=="India"){
            System.out.println("person from indian");
        }
        else{
            System.out.println("person from foreigner");
        }

    }
}
