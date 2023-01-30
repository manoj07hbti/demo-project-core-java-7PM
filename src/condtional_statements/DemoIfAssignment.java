package condtional_statements;

public class DemoIfAssignment {
    public static void main(String[] args) {

        byte mark;
        mark=30;
        if(mark>=33){
            System.out.println("Student cleared exam with passing marks");
        }

        mark=59;
        if(mark>=55){
            System.out.println("Student cleared exam with second division");
        }

        mark=63;
        if(mark>=60){
            System.out.println("Student cleared exam with first division");
        }


        byte age;
        age=25;
        if(age<18){
            System.out.println("Person is Child");
        }

        age=41;
        if(age<45){
            System.out.println("Person is Young");
        }

        age=66;
        if(age>60){
            System.out.println("Person is Old");
        }
    }
}
