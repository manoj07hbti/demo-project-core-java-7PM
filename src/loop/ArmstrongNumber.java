package loop;

class ArmstrongNumber{
    public static void main(String args[]){
        int result,sum=0,temp;
        int number=153;

        temp=number;
        while(number>0){
            result=number%10;
            sum=sum+(result*result*result);
            number=number/10;
        }
        if(temp==sum)
            System.out.println("Armstrong Number ");
        else
            System.out.println("Not an Armstrong Number");
    }
}
