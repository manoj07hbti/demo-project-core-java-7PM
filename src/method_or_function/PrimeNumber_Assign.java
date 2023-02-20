package method_or_function;

public class PrimeNumber_Assign {
    //access_specifier return_type  method_name (parameter) {CODE..}
    public void PrimeNumber(int number){
        if(number %2==0){
            System.out.println("num is PRime");
        }
        else{
            System.out.println("number is not prime");
        }
    }



    public static void main(String[] args) {
        PrimeNumber_Assign obj=new PrimeNumber_Assign();
        obj.PrimeNumber(41);



    }
}
