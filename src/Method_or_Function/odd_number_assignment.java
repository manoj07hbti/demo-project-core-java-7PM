package Method_or_Function;

public class odd_number_assignment {
    public void odd() {

        for (int start = 1; start <= 100; start++) {
            if (start % 2 != 0) {
                System.out.println("odd number : " + start);
            }
        }

    }

    public static void main(String[] args) {
        odd_number_assignment result = new odd_number_assignment();
        result.odd();

    }
}

