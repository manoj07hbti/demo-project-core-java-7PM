package Loop;

public class Revisonpalendrom {
    public static void main(String args[]){
        int result,sum=0,temp;
        int number=545;

        temp=number;
        while(number>0){
        result=number%10;
        sum=(sum*10)+result;
        number=number/10;

        }

        if(temp==sum)

            System.out.println("palendrom number");
        else
            System.out.println("not palendrom number");





    }








           }













