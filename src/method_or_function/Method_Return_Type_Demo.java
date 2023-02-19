package method_or_function;

public class Method_Return_Type_Demo {

    //Write a method which will give welcome message//

    //access_specifier_return_type_ method_name (input parameter)  {CODE..........}//

    public String welcome(String name) {
        String message = "Welcome to java Programming : " + name;

        return message;

    }

    public int makeCube(int number) {

        int cube = number * number * number;

        return cube;

    }

    public double percentage(int number, int ratio) {
        double result = ((double) number * (double) ratio) / 100;
        return result;

    }

    public static void main(String[] args) {
        Method_Return_Type_Demo obj = new Method_Return_Type_Demo();
        String output = obj.welcome("Aman");
        System.out.println(output);

        int cube = obj.makeCube(5);
        System.out.println(cube);

        double percentage = obj.percentage(5, 2);
        System.out.println(percentage);

    }
}
