public class AndOperator {
    public static void main(String[] args) {

        int Age=19;
        String City="Delhi";

        if (Age>18 & City=="Delhi"){
            System.out.println("Person is eligible for voting");

        }

        Age=20;
        City="Mumbai";
        if (Age>18 & City=="Mumbai"){
            System.out.println("Person is eligible for voting");
        }

        Age=21;
        City="Chennai";
        if (Age>18 & City=="Chennai") {
            System.out.println("Person is eligible for voting");

        }

        Age=22;
        City="Banglore";
        if (Age>18 & City=="Benglore") {
            System.out.println("Person is eligible for voting");
        }
        else {
            System.out.println("Person is not eligible for voting");
        }














        }
}