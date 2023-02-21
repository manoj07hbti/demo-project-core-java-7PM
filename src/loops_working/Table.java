package loops_working;

public class Table {
    public static void main(String[] args) {
        int Number = 2;
        for (int i = 1; i <= 10; i++) {

            System.out.println(Number * i);
            System.out.println(Number + "X" + i + "=" + Number * i);
        }


        for (int i = 10; i >= 1; i--) {

            System.out.println(Number * i);
            System.out.println(Number + "X" + i + "=" + Number * i);

        }
    }
}
