package condtional_statements;

public class DemoIfElse {
    public static void main(String[] args) {

        byte age=19;
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not Eligible for voting");
        }

        String city="delhi";
        if(city=="Agra"){
            System.out.println("Person belongs to Agra");
        }
        else {
            System.out.println("Person does not belongs to Agra");
        }

        byte marks=32;
        if(marks>=33){
            System.out.println("Student Cleared Exam");
        }
        else {
            System.out.println("Student got failed in exam");
        }


    }
}
