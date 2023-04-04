package important_keywords;

public  class DemoFinalKeyword {

    //with class : no one can create child class that class//
    //with method : no one can override method//
    //with variable : no one can change the value of final variable//

    // final with class
    public final void m1(){
        final int age=22;
     //   age=23;  we can't change the value of final variable

        //final with method
        System.out.println("this is final Method and no one can overide");

    }

}
