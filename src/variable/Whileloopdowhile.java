package variable;

public class Whileloopdowhile {
    public static void main(String[] args) {
        int num = 0, rem = 0;
        for (int i = 1; i <= 100; i++) {
            rem = i % 2;
            if (rem == 0)
            {
                System.out.println("Number "+i+" is Even");
            }
            else{
                System.out.println("Number "+i+" is Odd");

            }
        }
    }
}