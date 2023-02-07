package Loops;

public class Break_and_Continue_Loop {
    public static void main(String[] args) {
        //Break loop//
        for (int i = 1; i <= 15; i++) {
            System.out.println("This is DEMO break loop.." + i);
            if (i == 6) {
                break;

            }
        }
        //Continue loop//
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("This is my demo continue loop" + i);
        }
    }
}
