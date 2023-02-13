package Method_or_Function;

public class square_method {
    public void square(){
        int number = 3;
        int sq= number*number;
        System.out.println("square of the number is : " +sq);
    }

    public static void main(String[] args) {
        square_method result = new square_method();
                result.square();
    }
}
