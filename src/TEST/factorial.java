package TEST;

public class factorial {

    public static void main(String[] args) {

        int i,factorial=1;

        int number=8;

        for (i=1;i<=number;i++){
            factorial=factorial*i;
        }

        System.out.println("factorial of" +number+ "is " +factorial);
    }
}
