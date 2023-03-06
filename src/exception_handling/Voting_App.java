package exception_handling;

public class Voting_App {
    public void Voting(int age) throws AgenoteligibleException{
        if (age>18){
            System.out.println("Welcome to voting app");
        }
        else {
            throw new AgenoteligibleException("Age should not less then 18, not eligble for voting");
        }
    }

    public static void main(String[] args) {
        Voting_App obj=new Voting_App();
       try {

        obj.Voting(17);
    }
       catch (Exception e){
           System.out.println("exception occured" +e);
       }
    }
}
