package method_or_function;

public class Calculate_percent {

    //Write a program to calculate percentage//

    //SYNTAX : access_specifier return_type method_name (parameter) {CODE...}

    public void percentage(int number, int ratio) {
        double result = (double) number * ratio / 100;
        System.out.println(ratio + " Percent of " + number + " is :" + result);


    }

    public static void main(String[] args) {
        Calculate_percent obj = new Calculate_percent();
        obj.percentage(130, 10);
        obj.percentage(160, 20);
        obj.percentage(155, 30);
    }
}
