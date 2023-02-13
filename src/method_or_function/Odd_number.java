package method_or_function;

public class Odd_number {

    //Create a method print odd number between 1 to 100 //

    //// SYNTAX : access_specifier return_type method_name (parameter) {CODE...}

    public void oddMethod() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number is :" + i);

            }
        }

    }

    public static void main(String[] args) {
        //SYNTAX 1 : ClassName objName = new ClassName();
        Odd_number obj = new Odd_number();
        //SYNTAX : objName.methodName();
        obj.oddMethod();

    }

}
