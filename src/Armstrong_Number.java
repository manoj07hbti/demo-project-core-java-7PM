public class Armstrong_Number {
    public static void main(String[] args) {

        int number= 371, orignalnumber, reminder,result=0;
        orignalnumber=number;
        while (orignalnumber!= 0){
            reminder=orignalnumber % 10;
            result += Math.pow(reminder, 3);
            orignalnumber/=10;

        }
        if (result==number){
            System.out.println(number+ " : Is an Armstrong Number");
        }
        else {
            System.out.println(number+ " : Is Not an Armstrong Number");
        }



    }
}
