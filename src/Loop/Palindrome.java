package Loop;

class PalindromeExample{
    public static void main(String args[]){
        int result,sum=0,temp;
        int number=454;

        temp=number;
        while(number>0){
            result=number%10;
            sum=(sum*10)+result;
            number=number/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
