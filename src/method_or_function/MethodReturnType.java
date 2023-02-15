package method_or_function;

public class MethodReturnType {

    //access_specifier return_type  method_name (input param) {CODE..}

    public String  welcome(String name ){

        String message= "Welcome to java Programming : "+name;

        return message;
    }


    public int makeCube(int number){

        int cube= number*number*number;

       return cube;
    }

    public double percentage(int number , int ratio){

        double percentage=   ((double)number*(double)ratio)/100;

        return percentage;
    }


    public static void main(String[] args) {

        MethodReturnType obj= new MethodReturnType();
        String output= obj.welcome("Mohit");
        System.out.println(output);

        int result= obj.makeCube(3);
        System.out.println("Cube is "+result);

        double percentage =obj.percentage(5,2);

        System.out.println("Percentage of given number is "+percentage);

    }
}
