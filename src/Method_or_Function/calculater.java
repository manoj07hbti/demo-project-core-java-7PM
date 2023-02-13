package Method_or_Function;

public class calculater {
    public void add(){
        int a = 3;
        int b= 5;
        int sum;
        sum = a+ b;
        System.out.println("Addition of two number : " +sum);

    }
    public void sub(){
        int a = 3;
        int b= 5;
        int sub;
        sub = a- b;
        System.out.println("substration of two number : " +sub);
    }
    public void divide(){
        int a = 58;
        int b= 8;
        double div;
        div = (double) a/b;
        System.out.println("divide of two number : " +div);
    }    public void multiply(){
        int a = 58;
        int b= 8;
        double multiply;
        multiply = (double) a*b;
        System.out.println("multiplication of two number : " +multiply);
    }
    public static void main(String[] args) {
        calculater addition = new calculater();
        addition.add();
        calculater substration = new calculater();
        substration.sub();
        calculater division = new calculater();
        division.divide();
        calculater multiplication = new calculater();
        multiplication.multiply();

    }
}
