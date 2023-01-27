package conditional_statement;

public class Ashish_Assignment2 {
    public static void main(String[] args) {
        System.out.println("person age = ?");
        int age1 = 35;
        System.out.println("person age = " +age1);
        if (age1 < 18) {
            System.out.println("Person is Child");
        }
        if (age1 >= 18) {
            if (age1 < 45) {
                System.out.println("Person is young ");
            }
        }
        if (age1 >= 45) {
            if (age1 < 60) {
                System.out.println("Person age is between 45 and 60 ");
            }
        }
        if (age1 > 60) {
            System.out.println("Person is old ");
            }
        }
}
