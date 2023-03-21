package exception_handling;

public class VotingApp {
    public void doVoting(int age) throws NotEligibleException{
        if (age<18){
            throw new NotEligibleException("You are not eligible for Voting");
        }
        else {
            System.out.println("Welcome to Voting Program");
        }
    }

    public static void main(String[] args) {
        VotingApp obj= new VotingApp();
        try {
            obj.doVoting(16);
        }
        catch (Exception e){
            System.out.println("Exception Occurred :"+e);
        }
    }
}
