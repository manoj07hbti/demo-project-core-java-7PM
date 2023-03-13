package exception_handling;

public class VotingApp {
    public void doVoting(int age) throws AgeNotEligibleException{
        if (age>=18){
            System.out.println("Welcome to voting application");
        }
        else {
            throw new AgeNotEligibleException("Age should not be less than 18, Not eligible for voting ");
        }
    }

    public static void main(String[] args) {
        VotingApp obj = new VotingApp();
        try {
            obj.doVoting(17);
        }
        catch (Exception e){
            System.out.println("Exception occurred" +e);
        }

    }
}
