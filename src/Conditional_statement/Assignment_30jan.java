package Conditional_statement;

public class Assignment_30jan {

    public static void main(String[] args) {

        //marks >=33 and <44 ----- cleares exam with Third division
        //marks >44  and <60--- second division
        //marks >60   ----> first division

        int marks=42;
        if(marks>=33 & marks<44){
            System.out.println("MARKS =" +marks);
            System.out.println("Cleared the exam with third division :" +marks);
        }
        marks=55;
        if (marks>=44 & marks<60){
            System.out.println("MARKS = " +marks);
            System.out.println("Student clear the exam with second division");
        }
        marks=80;
        if(marks>60){
            System.out.println("MARKS = " +marks);
            System.out.println("Studnet clear the exam with first division");
        }
        else{
            System.out.println("student fail in exam");
        }
    }
}
