package ConditionStatement;

public class demoIf {
    public static void main(String args[]) {
        //if (expression or condition){
        //           Code
        // }

       int marks;//student cleard exam with passing mark//
        marks=33;
        if(marks>32) {
            System.out.println("student cleard exam with passing marks");
        }

        marks=55; //student cleard exam with second division//
        if(marks<56){
            System.out.println("student cleard exam with second division");

        }
        marks=65;//student cleard exam with first division//
        if(marks<67){

            System.out.println("student cleard exam with first division");
        }
        // age less than 18:person is child//
            int age;
            age=18;
            if(age<19){

            System.out.println("person is child");

            }
         //age less than 45:person is young//

            if(age<45) {
                System.out.println("persom is young");
            }
          // age less than 60:person is old//
             if(age<60){

               System.out.println("person is old");
             }



    }


}




