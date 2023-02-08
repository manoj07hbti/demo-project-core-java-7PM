import javax.imageio.ImageTranscoder;

public class Armstrongnumber {
    public static void main(String[] args) {

        int number=372, orignalnumber, reminder,result=0;
        orignalnumber=number;
        while (orignalnumber !=0){
            reminder=orignalnumber %10;
            result+= Math.pow(reminder,3);
            orignalnumber/=10;
        }
        if (result==number){
            System.out.println("this is an armstrong number ");
        }
        else {
            System.out.println("this is not an armstrong number");
        }


        }
    }
