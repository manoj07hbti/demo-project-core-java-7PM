package method_or_function;

public class CheckBalance {
    //check min balacne 5000 then only ac open
    public int checkBalance(int number){
        int balance=5000;
        return balance;

    }

    public static void main(String[] args) {
        CheckBalance obj=new CheckBalance();
        int balance= obj.checkBalance(5000);
        if(balance>5000){


        }


    }
}
