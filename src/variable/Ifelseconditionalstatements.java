package variable;

public class Ifelseconditionalstatements {
    public static void main(String[] args) {

        int age = 21;
        if (age > 18) {
            System.out.println("Eligible for voting");

        } else {
            System.out.println("Not eligible for voting");
        }

        String city = "Pune";
        if (city == "Pune") {
            System.out.println("Person belongs to Pune");
        } else {
            System.out.println("Person does not belongs to Pune");
        }
        int marks=40;
        if (marks > 35) {
            System.out.println("Student passed the exam");
        }
        else{
            System.out.println("Student failed in exam");
        }

    }
}