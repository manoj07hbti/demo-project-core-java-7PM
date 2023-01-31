package variable;

public class ORcondition {
    public static void main(String[] args) {
        //TRUE||TRUE=TRUE;
        int marks = 40;

        if (marks >= 33 || marks <= 44) {
            System.out.println("Student cleared exam with third division");

        } else {
            System.out.println("Student failed in exam");
        }
        //TRUE||FALSE=TRUE;
        marks = 50;
        if (marks >= 44 || marks <= 65) {
            System.out.println("Student clears exam with second division");
        } else {
            System.out.println("Student clears exam with first division");
        }
            //FALSE||TRUE=TRUE;
            marks = 41;
            if (marks >= 61 || marks <= 65) {
                System.out.println("Student cleared the exam");

            } else {
                System.out.println("Student has to reappear the exam");
            }
            //FALSE||FALSE=FALSE;
            marks = 25;
            if (marks >= 70 || marks <= 75) {
                System.out.println("student cleared the exam with first division");
            } else {
                System.out.println("Student failed the exam");

            }
        }

    }
