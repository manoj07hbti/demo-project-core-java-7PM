package method_or_function;

public class MethodReturnType {
    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public String welcome(String name){

        String wel = name;

        return wel;
    }

    public int cube(int num){

        int cube = num*num*num;
        System.out.println("Cube of "+num+" is:- "+cube);

        return cube;
    }

    public double percentage(int num,int per){

        double result = (double) num*per/100;

        return result;
    }

    public static void main(String[] args) {

        MethodReturnType obj = new MethodReturnType();

        String output = obj.welcome("Aman");
        System.out.println("Welcome to java programing "+output);

        int out = obj.cube(3);
        System.out.println(out);

        double per = obj.percentage(89,7);
        System.out.println(per);
    }
}
