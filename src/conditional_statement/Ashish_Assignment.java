package conditional_statement;

public class Ashish_Assignment {
    public static void main(String[] args) {
        System.out.println("student marks = ?");
        int mark1 = 65;
        System.out.println("student marks = " +mark1);
        if (mark1 >= 33) {
            if (mark1 < 55) {
                System.out.println("Student cleared the exam with passing marks");
            }
        }
        if (mark1 >= 55) {
            if (mark1 < 60) {
                System.out.println("Student cleared exam with second division");
            }
        }
        if (mark1 >= 60) {
            System.out.println("Student cleared exam with first division");
        }

    }
}
