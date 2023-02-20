package method_or_function;

public class CalculatorWithReturnType {
    // Calculator with rReturn type value
    public int Add(int a , int b){
        int sum = a+b;
        return sum;
    }
    public int Subt(int a, int b){
        int subt=a-b;
        return subt;
    }
    public int Multi(int a, int b){
        int multi=a*b;
        return multi;

    }
    public double Divide(double a, double b){
        double divide=a/b;
        return divide;
    }


    public static void main(String[] args) {
        CalculatorWithReturnType obj=new CalculatorWithReturnType();
        int sum=obj.Add(9,8);
        System.out.println("sum is "+sum);
        int subt= obj.Subt(25,15);
        System.out.println("subt of num is : "+subt);
        int multi=obj.Multi(15,5);
        System.out.println("Multi of given number" +multi);
        double divide= obj.Divide(55,8);
        System.out.println("Divide of given number: "+divide);


    }
}
