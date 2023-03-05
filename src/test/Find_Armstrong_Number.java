package test;

public class Find_Armstrong_Number {
    public static void main(String[] args) {
        int number=666, orignalnumber,reminder,result=0;
        orignalnumber=number;
        while (orignalnumber!=0){
            reminder=orignalnumber%10;
            result+=Math.pow(reminder,3);
            orignalnumber/=10;
        }
        if (result==number){
            System.out.println(number+ " : number is an Armstrong number" );
        }
        else {
            System.out.println(number+ " : Number is not an Armstrong number");
        }
    }
}
