package Method_obje;

public class Return_type {
    public int Addition(int a, int b){
    int sum= a+b;
    return sum;
}
    // this is subtract method
    public int Subtraction(int a, int b){

        int Subtract= b-a;
        return Subtract;
    }
    // this is multiply method
    public int multiply(int a, int b){

        int multiply= a*b;
       return multiply;
    }
    // this is divided method
    public double divided(int a, int b){
        double divided= (double) a/b;
        return divided;
    }
    // create a method which will make cube of given number
    public int cube(int number){
        int cube = number*number*number;
        return cube;
    }


    public static void main(String [] args) {

        Return_type obj = new Return_type();
        int sum = obj.Addition(5,6);
        System.out.println(sum);

        int Subtract = obj.Subtraction(2,6);
        System.out.println(Subtract);

        int multiply = obj.multiply(2,50);
        System.out.println(multiply);

        double divided = obj.divided(5,9);
        System.out.println(divided);

        int cube = obj.cube(5);
        System.out.println(cube);

    }
}
