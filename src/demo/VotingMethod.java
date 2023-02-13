package demo;

public class VotingMethod {
    public void voting() {
        String city = "Agra";
        int age = 20;
        if (age >= 18 & city == "Agra") {
            System.out.println("Person is eligible for voting");
        }
            else{
                System.out.println("Person is not eligible for voting");
            }
        }

    public static void main(String[] args) {

        VotingMethod obj = new VotingMethod();
        obj.voting();//calling VotingMethod

        }
    }

