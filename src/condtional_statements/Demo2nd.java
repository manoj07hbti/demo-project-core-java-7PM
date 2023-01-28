package condtional_statements;

public class Demo2nd {
    public static void main(String[] args) {
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

        // 1.Age less than 18 : Person is Child//
        int age;
        age=18;
        if(age<19){
            System.out.println("Person is child");
        }

        // 2.Age less than 45 : Person is young//
        if(age<45){
            System.out.println("Person is young");
        }

        // 3.Age Greater than 60 : Person is old//
        if(age<60){
            System.out.println("Person is old");

        }
}}
