public class Demo {
    public static void main(String[] args) {

        int number=1646, reversenumber=0, reminder;
        int orignalnumber=number;

        while (number!=0){
            reminder= number%10;
            reversenumber= reversenumber * 10+reminder;
            number/=10;
        }
        if (orignalnumber==reversenumber){
            System.out.println(orignalnumber+ " : palindrom");
        }
        else {
            System.out.println(orignalnumber+ " : not");
        }







    }
}
