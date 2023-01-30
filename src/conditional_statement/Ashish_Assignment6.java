package conditional_statement;

public class Ashish_Assignment6 {
    public static void main(String[] args) {
        int marks= 85;

        if ((marks>=33)&&(marks<44)){
            System.out.println("marks = " +marks);
            System.out.println("cleares exam with Third division");
        }
        else if ((marks>=44)&&(marks<60)){
            System.out.println("marks = " +marks);
            System.out.println("cleares exam with second division");
        }
        else if ((marks>60)){
            System.out.println("marks = " +marks);
            System.out.println("cleares exam with first  division");
        }
        else{
            System.out.println("marks = " +marks);
            System.out.println("failed to clear exam");
        }
    }
}
