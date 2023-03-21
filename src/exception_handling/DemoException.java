package exception_handling;

public class DemoException {
    int result;
    public void divide(int a, int b){

        try {
            result = a / b;
        }
        catch (Exception e){
            System.out.println("Exception Occurred : "+e);
        }
    }

    public static void main(String[] args) {
        DemoException obj= new DemoException();
        obj.divide(9,4);
        System.out.println("Result = "+obj.result);
        obj.divide(4,0);
        System.out.println("Result = "+obj.result);

    }
}
