package Method_obje;

public class Doctor {

    // SYNTEX: Doctor :  visit/ checkup / surgery

    public void visit(){

        System.out.println("doctor visit to hospitals");
    }
    private void checkup(){
        System.out.println("Doctor can be do checkup");

    }
    public void surgery(){

        System.out.println("this doctor is a surgen");
    }
    public static void main(String[] args){

        Doctor obj = new Doctor();
        obj.visit();
        obj.checkup();
        obj.surgery();

    }
}
