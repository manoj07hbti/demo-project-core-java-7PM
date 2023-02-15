package method_or_fuction;

public class Calculator {


        // access_specifier return_type  method_name (parameter) {CODE..} //


    public int addMethod(int a , int b){

        int sum = a+b;

        return sum;

    }

    public int Subtraction(int a , int b ){

        int sub= a-b;

        return sub;
    }

    public int Multiply(int a , int b){

        int mul =a*b;

        return mul;
    }

    public double  divide(int a, int b){

        double div = (double)a/b;

        return div;
    }


    public static void main(String[]ar){

        Calculator obj = new Calculator();

      int sum =  obj.addMethod(34,54);

        System.out.println("Printing Addition Is :"+sum);

        int sub = obj.Subtraction(23,53);

        System.out.println("Printing Subtraction Is :"+sub);

        int mul = obj.Multiply(12,24);

        System.out.println("Printing Multiply Is : "+mul);

        double div = obj.divide(12,11);

        System.out.println("printing Divide Is : "+div);

        {

        }
    }


}
