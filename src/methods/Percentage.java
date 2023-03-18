package methods;

public class Percentage {
    int result;
    public void per(int number , int percent){

        result = number*percent/100;
        System.out.println(percent+" % of "+number+" is "+result);
    }

    public static void main(String[] args) {
        Percentage p = new Percentage();
        p.per(330,30);
    }
}
