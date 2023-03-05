package core_java_test;

import java.util.Scanner;

public class Voting_app {

    //Write a program to check a person is eligible for voting in a AGRA city//
    public void voting(int age, String city) {
        if (age >= 18 & city == "AGRA") {
            System.out.println("Person is eligible voting in AGRA");
        } else {
            System.out.println("Person is not Eligible for Voting in AGRA ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter age :");
        Scanner scannerObj = new Scanner(System.in);
        int age = scannerObj.nextInt();

        System.out.println("Please enter your city :");
        String city = scannerObj.nextLine();
        Voting_app obj = new Voting_app();
        obj.voting(age, city);

    }

}
