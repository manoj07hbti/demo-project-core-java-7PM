package conditional_statements;

public class If_AND_operator {
    public static void main(String[] args) {
        // 1.Write a program to check age and city of voter
        // :Age should be greater than 18 and if city is in (DELHI , MUMBAI , CHENNAI , BANGALORE) then print metro city//
        // Person is eligible for voting in Metro city//
        // Person is not eligible for voting in Metro city//

        int age;
        String city;
        age = 30;
        city = "DELHI";
        if (age >= 18 & city == "DELHI" || city == "MUMBAI" || city == "CHENNAI" || city == "BANGALORE") {
            System.out.println("Person is eligiable for voting in Metro City");
        } else {
            System.out.println("Person is not eligible for voting in Metro City");
        }
    }
}
