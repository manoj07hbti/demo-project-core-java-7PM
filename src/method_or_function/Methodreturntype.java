package method_or_function;

public class Methodreturntype {

    public String  welcome(String name) {
        String massage="welcome to shekhar world : " +name;
        return massage;
    }

    public static void main(String[] args) {

        Methodreturntype obj=new Methodreturntype();
    String output= obj.welcome("Shekhar");
    System.out.println(output);



    }
}
