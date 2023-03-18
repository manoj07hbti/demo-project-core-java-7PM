package methods;

public class Eligibility {
    int age=16;
    String City = "Agra";

    void VotingEligibilityCheck(){
        if(age>=18 & City == "Agra"){
            System.out.println("Person is Eligible for Voting");
        }
        else {
            System.out.println("Person is not Eligible for Voting");
        }
    }

    public static void main(String[] args) {
        Eligibility E = new Eligibility();
        E.VotingEligibilityCheck();
    }
}
