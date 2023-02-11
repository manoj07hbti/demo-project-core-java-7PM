package method_or_function.method_or_function;

public class Calculator {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void add(){

        int j=3;
        int k=4;

        int sum=j+k;

        System.out.println("Addition j and k"+sum);
    }
        public void subtract() {

            int a = 10;
            int b = 5;

            int sum = a - b;

            System.out.println("Subtract a abd b" + sum);
        }
         public void multiply() {

             int m = 12;

             int n = 12;

             int sum = m * n;

             System.out.println("Multiply m and n" + sum);
         }
         public void divide(){

           int t =145;

           int s= 12;

           double divide=  (double) t/s;

           System.out.println("Division is "+divide);

         }

         public static void main(String args[]){

             // SYNTAX className objectName = new className();

             Calculator  obj =new Calculator();

             obj.add();

             obj.subtract();

             obj.multiply();

             obj.divide();

         }






}
