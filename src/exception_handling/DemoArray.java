package exception_handling;

public class DemoArray {
    public static void main(String[] args) {
        int marks[]= {44, 45, 54, 62,45};
        System.out.println("printing marks at index 0 is : " + marks[0]);
        System.out.println("printing marks at index 1 is : " + marks[1]);
        try {
            System.out.println("printing marks at index 5 is : " + marks[5]);
        }
        catch (Exception e){
            System.out.println("Exception occured is : " +e);
        }
        System.out.println("printing marks at index 3 is : " + marks[3]);
        System.out.println("printing marks at index 2 is : " + marks[2]);
        System.out.println("printing marks at index 4 is : " + marks[4]);

    }
}
