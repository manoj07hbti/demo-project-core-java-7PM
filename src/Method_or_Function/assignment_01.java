package Method_or_Function;

public class assignment_01 {
    public void cube(){
        int number = 3;
        int cub= number*number*number;
        System.out.println("cube of the number is : " +cub);
    }

    public static void main(String[] args) {
        assignment_01 result = new assignment_01();
        result.cube();
    }
}

