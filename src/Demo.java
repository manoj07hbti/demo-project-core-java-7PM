public class Demo {
    public static void main(String[] args) {

        int number=371,orignalnumber,reminder,result=0;
        orignalnumber=number;
        while (orignalnumber!=0){
            reminder=orignalnumber%10;
            result +=Math.pow(reminder,3);
            orignalnumber/=10;
        }
        if (result==number){
            System.out.println(number+  "yes");
        }
        else {
            System.out.println(number+ "no");
        }
    }
}
