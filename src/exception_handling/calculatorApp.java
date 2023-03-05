package exception_handling;

public class calculatorApp {
    public int divide(int a, int b){
        int result =0;
        try {
            result = a / b;
        }
        catch (Exception e){
            System.out.println("Exception occured is : " +e);
        }

        return result;
    }


    public static void main(String[] args) {
        calculatorApp obj = new calculatorApp();
        int c = obj.divide(5, 4);
        System.out.println("result of division by integer : " +c);
        int d = obj.divide(5, 0);
        System.out.println("result of division by integer : " +d);



    }
}
