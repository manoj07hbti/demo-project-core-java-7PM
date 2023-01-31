package condtional_statements;

public class ORANDassignment {
    public static void main(String[] args) {

        int age = 36;
        String city = "AGRA";

        if (age >= 18 & city == "DELHI" || city == "MUMBAI" || city == "CHENNAI" || city == "BANGALORE") {

            System.out.println("Person is eligible for voting in Metro City");
        } else {

            System.out.println("Person is not eligible for voting in Metro City");
        }

        int marks = 365;

        if (marks >= 33 & marks < 44) {

            System.out.println("Student cleared exam with THIRD DIVISION");
        }
        if (marks >= 44 & marks < 60) {

            System.out.println("Student cleared exam with SECOND DIVISION");
        }
        if (marks >= 60) {

            System.out.println("Student cleared exam with FIRST DIVISION");
        }
        if(marks<33){

            System.out.println("Student has failed in the exam");
        }


    }
}
