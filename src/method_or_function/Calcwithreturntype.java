package method_or_function;

public class Calcwithreturntype {
    public int sum(int a, int b){
        int calculate=a+b;
        return calculate;
    }
    public int Sub(int a , int b){
        int subtract=a-b;
        return subtract;
    }
    public int multiply(int a, int b){
        int multi=a*b;
        return multi;
    }
    public  int devide(int a, int b){
        int Devide=a/b;
        return Devide;
    }

    public static void main(String[] args) {
        Calcwithreturntype obj=new Calcwithreturntype();
        int result=obj.sum(5,10);
        System.out.println("sum is : " +result);

        int Subtract= obj.Sub(55,15);
        System.out.println("Sub value is : " +Subtract);

        int multip= obj.multiply(10,8);
        System.out.println("Multi is : " +multip);

        int Total= obj.devide(90,9);
        System.out.println("Devide result is : " +Total);
    }
}
