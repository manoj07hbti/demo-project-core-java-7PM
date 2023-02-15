package demo;

public class MethodInput_Percentage {
    //SYNTAX: access_specifier return_type method_name(Parameter){CODE}
    public void percentage(int num1, int num2){
        int ans= num1*num2/100;
        System.out.println(num2+" Percent of "+num1+" is: " +ans);
    }
    public static void main(String[] args) {
        MethodInput_Percentage obj= new MethodInput_Percentage();
        obj.percentage(120,10);
        obj.percentage(525,10);
        obj.percentage(6500,20);
        obj.percentage(750,8);

    }
}
