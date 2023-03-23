package inhertanceMethod;

public class Doctor extends Hospital{
    // we use the parents  class method are call in child class
    public void name(String name){

        System.out.println("doctor's name"+name);
    }
    public void salary(double salary){
        System.out.println("salary of doctor"+salary);

    }
    protected void department(String department){
        System.out.println("doctor's department"+department);
    }
    public static void main(String [] args){
        Hospital obj = new Hospital();// we can create method of parents class
        obj.m4();
    }



}