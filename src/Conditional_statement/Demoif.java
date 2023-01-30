package Conditional_statement;

public class Demoif {

    public static void main(String args []){

        // 27 jan Assignment
         //Syntax  :    if(expression or condition){
        //                  Code
        //                  }

        // mark:33 - Student cleared exam with  passing mark

        int mark=33;
        if(mark>=33){
            System.out.println("Student clear the exam with passing mark :" +mark);
        }

        // mark 55 - Student cleared the exam with second division
        if(mark<55){
            System.out.println("Student cleared the exam with second division : "  +("55"));
        }

        //mark 60 - student cleared exam with first division

        if(mark<60){
            System.out.println("Student cleared the exam with first division : " +("60"));
        }

        int age=18;

        // age less than 18 person is child
        if(age>17){
            System.out.println("Person is  Child : " +age);
        }

        //age - 45 Person is young

        if(age<45){
            System.out.println("Person is Young :" +("45"));
        }

        //age:60 Person is old
        if(age<60){
            System.out.println("Person is OlD : " +("60"));
        }
    }
}
