package exception_handling;

public class AccountOpeningApp {

      public static void main(String args[]){

        AccountOpeningApp obj = new AccountOpeningApp();

        try {
            obj.OpenAccount(8000);
        }
        catch(Exception e) {

            System.out.println("Exception occurred :" + e);


          }





      }

    public void OpenAccount(double amount) throws  LessAmount_Exception{

        if(amount<=5000){

            throw new LessAmount_Exception("deposite amount should be grater than 5000");
        }
        else {

            System.out.println("Open account Successfuly");
        }
    }







}
