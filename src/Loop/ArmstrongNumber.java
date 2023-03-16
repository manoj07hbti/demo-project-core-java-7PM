package Loop;

public class ArmstrongNumber {
    public static void main(String args[]) {

        int result,sum=0,temp;
        int number=153;

        temp=number;
        while(number>0){
          number=number%10;
          sum=sum+(number*number*number);
           number=number/10;

           if(temp==sum){

               System.out.println("Armstrong number");
           }
          else{
              System.out.println("not  an Armstrong number");
           }



        }












    }

}













