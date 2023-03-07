package method_or_function;

public class CalculatorReturnType {

    public int add(int a,int b){

        int sum = a+b;

        return sum;
    }

    public int sub(int a,int b){

        int sub = a-b;

        return sub;
    }

    public int mul(int a,int b){

        int mul = a*b;

        return mul;
    }

    public double divide(int a,int b){

        double result =(double) a/b;

        return result;
    }

    public static void main(String[] args) {

        CalculatorReturnType obj = new CalculatorReturnType();

        int sum = obj.add(5,8);
        System.out.println(sum);

        int sub = obj.sub(44,65);
        System.out.println(sub);

        int mul = obj.mul(4,5);
        System.out.println(mul);

        double divide = obj.divide(54,65);
        System.out.println(divide);
    }
}
