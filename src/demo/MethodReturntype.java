package demo;

public class MethodReturntype {
    public int add (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public int subtract(int a, int b){
        int ans= a - b;
        return ans;
    }
    public int multiply(int a, int b){
        int ans= a * b;
        return ans;
    }
    public int divide(int a, int b){
        int ans= a/b;
        return ans;
    }

        public static void main (String [] args){
            MethodReturntype obj= new MethodReturntype();
            int sum =obj.add(4,8);
            System.out.println("Sum is" +sum);
            int ans= obj.subtract(12,4);
            System.out.println("Ans is " + ans);
            int ansm= obj.multiply(5,5);
            System.out.println("Ans is " + ansm);
            int ansd= obj.divide(15, 3);
            System.out.println("Ans is "+ ansd);
            }
        }


