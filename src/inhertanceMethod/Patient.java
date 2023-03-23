package inhertanceMethod;

public class Patient extends Doctor {
    public void m1(){

        System.out.println("this is m1 method and call in hospital class");
    }
    public int m2(){
        int a=2;
        int b=3;
        int sum= a+b;
        System.out.println( "this is m2 method "+sum);
        return sum;

    }
    protected void m3(){

        System.out.println("this is m3 method and call for other class");
    }

    public void earn(){
        double spend= 2536;

        System.out.println("patient spend money in hands"+spend);
        System.out.println("aman"+"karan"+"subham");
    }
    public void sick(String sick){

        System.out.println("sick department"+sick);
    }
    public static void main(String [] args){
     Doctor obj =new Doctor();
     obj.name("harish");
     obj.salary(2536.25);
     obj.department("sergen");

    }
}
