package Method_or_Function;

public class square_method {
    public int square(int number){
        int sq= number*number;
        return sq;
    }

    public static void main(String[] args) {
        square_method result = new square_method();
                int output = result.square(5);
        System.out.println("Square of the number is : "+output);
    }
}
