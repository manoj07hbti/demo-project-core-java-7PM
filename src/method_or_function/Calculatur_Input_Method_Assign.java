package method_or_function;

public class Calculatur_Input_Method_Assign {

    public void CalculatorPercentage(double a, double b){
        double Percentage=(a*b)/100;
        System.out.println("Percentage of Given Number" +  Percentage);

    }

    public static void main(String[] args) {
        Calculatur_Input_Method_Assign obj=new Calculatur_Input_Method_Assign();
        obj.CalculatorPercentage(100,60);
        obj.CalculatorPercentage(9,6);
    }
}
