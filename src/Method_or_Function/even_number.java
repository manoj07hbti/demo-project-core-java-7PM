package Method_or_Function;

public class even_number {
    public void even() {

        for (int start = 1; start <= 50; start++) {
            if (start % 2 == 0) {
                System.out.println("Even number : " + start);
            }
        }

    }

    public static void main(String[] args) {
        even_number result = new even_number();
        result.even();

    }
}
