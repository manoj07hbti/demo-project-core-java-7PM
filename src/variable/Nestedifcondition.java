package variable;

public class Nestedifcondition {
    public static void main(String[] args) {
        int num=4;
        if(num>0){
            if(num%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
         num=25;
        if(num>0){
            if(num%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }


    }
}
