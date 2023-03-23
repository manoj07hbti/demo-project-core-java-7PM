package inhertanceMethod;


public class InputClass extends Patient {
    // we can call only parents class

    public static void main(String []args){

        Patient obj = new Patient();// we can do create method of parents class
        obj.earn();
        obj.m1();
        obj.m3();
        obj.sick("ot");

    }

    }
