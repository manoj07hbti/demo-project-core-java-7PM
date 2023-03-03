package exception_handling;

public class AccountOpeningApp {

    public void opening(double amount)throws DemoAccountOpening{

        if(amount>5000){
            System.out.println("Account Open  Successfully ");

        }
        else {
            throw new DemoAccountOpening("Deposite Amount Should be Greater Than 5000");
        }

    }
    public static void main(String[]args){

        AccountOpeningApp obj =new AccountOpeningApp();
        try {
            obj.opening(5000.45);
        }
        catch (Exception e){
            System.out.println("Exception Occurred "+e);
        }




    }



}
