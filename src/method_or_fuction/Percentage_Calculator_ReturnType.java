package method_or_fuction;

public class Percentage_Calculator_ReturnType {


    // Write A Program  Percentage Calculator And Return Type //

    //SYNTAX: access_specifier return_type method_name(Parameter){CODE}

    public double percentage(int num, int ratio){

        double result=(double) num* (double) ratio/100;

        return result;

    }

    public static void main(String[] args) {

        Percentage_Calculator_ReturnType obj = new Percentage_Calculator_ReturnType();

      double result =  obj.percentage(564,36);

        System.out.println("Calculator Printing Percentage : "+result);
    }





}
