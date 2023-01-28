package conditional_statements;

public class Demo_If_Condition {

    public static void main(String[] args){

        //Assignment 27 Jan//

        //if(expression or condition){
        // Code
        //      }

        // 1.Marks 33 : Student cleared exam with passing marks//
        int marks;
        marks=33;
        if(marks>32){
            System.out.println("Student cleared exam with passing marsks");
        }

        // 2.Marks 55 : Student cleared exam with second division//
        if(marks<55){
            System.out.println("Student cleared exam with second division");
        }

        // 3.Marks 60 : Student cleared exam with first division//
        if(marks<60){
            System.out.println("Student cleared exam with first division");
        }

        // 1.Age less than 18 : Person is Chlid//
        int age;
        age=18;
        if(age<19){
            System.out.println("Person is chlid");
        }

        // 2.Age less than 45 : Person is young//
        if(age<45){
            System.out.println("Person is young");
        }

        // 3.Age Greater than 60 : Person is old//
        if(age>60){
            System.out.println("Person is old");
        }
    }
}
