package method_or_function;

public class CalculatorInputParameter {

    public void add(int a,int b){

        int Add=a+b;

        System.out.println(a+" + "+b+" = "+Add);
    }

    public void sub(int a,int b){

        int Sub=a-b;

        System.out.println(a+" - "+b+" = "+Sub);
    }

    public void mul(int a,int b){

        int mul=a*b;

        System.out.println(a+" x "+b+" = "+mul);
    }

    public void divide(int a, int b){

        double divide =(double) a/b;

        System.out.println(a+" / "+b+" = "+divide);



    }


    public static void main(String[] args) {

        CalculatorInputParameter obj = new CalculatorInputParameter();

        obj.add(35,75);
        obj.add(675,767);

        obj.sub(67,45);
        obj.sub(67,876);

        obj.mul(54,2);
        obj.mul(43,67);

        obj.divide(34,17);
        obj.divide(34,3);

    }
}
