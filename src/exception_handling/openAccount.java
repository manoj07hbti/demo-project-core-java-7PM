package exception_handling;

public class openAccount {
    public void LessAmountException (int amount) throws LessAmountException{
        if (amount<5000){
            throw new LessAmountException(" Deposit amount shound be greater than 5000 ");
        }
        else {
            System.out.println("Account open successfully");
        }
    }

    public static void main(String[] args) {

        openAccount obj = new openAccount();
        try{
            obj.LessAmountException(4000);
        } catch (Exception e) {
            System.out.println("exception occurred " +e);
        }

    }
}
