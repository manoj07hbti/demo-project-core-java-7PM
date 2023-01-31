package Statements;

public class Assignment_30th_Jan {
    public static void main(String[] args) {
        //Checking Eligibility

        int age = 16;
        String city = "Mumbai";
        String city1 = "Pune";
        String city2 = "Delhi";
        String city3 = "Bangalore";

        if(age >= 18) {
            if (city==("Mumbai") || city1 == "Pune" || city2 == "Delhi" || city3 == "Bangalore") {
                System.out.println("Person is Eligible for Voting");
            } else {
                System.out.println("Person is not Eligible for Voting");
            }
        }
        else{
            System.out.println("Person is not Eligible for Voting");
        }
    }
}
