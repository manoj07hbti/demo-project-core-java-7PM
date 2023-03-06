package exception_handling;

public class Bank_Account_Opening {
    public void Account(int Amount) throws Less_Amount_Exception{
        if (Amount>=5000){
            System.out.println("Eligible for opening Bank Account");
        }
        else throw new Less_Amount_Exception("not Eligible for account opening");
    }

    public static void main(String[] args) {
        Bank_Account_Opening obj=new Bank_Account_Opening();
        try {
            obj.Account(4000);
        }
        catch (Exception e){
            System.out.println("Exception Occured : " +e);
        }
    }
}
