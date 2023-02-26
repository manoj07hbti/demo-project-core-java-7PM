package loops_working;

public class PalindromeNumberr {

    public static void main(String[] args) {

        int number=121, reversNum=0, remainder;                                // 121 = Palindrome Number is this 121
                                                                               // 121 % 10 = 1
        int originalNumber = number;                                           // reversNum = reversNum * 10 + remainder
                                                                               //           = 0 * 10 + 1 == 1
        while (number != 0){                                                   // 12 % 10 = 2
                                                                               // reversNum = reversNum * 10 + remainder
            remainder = number % 10;                                           //           = 1 * 10 + 2 == 12
                                                                               // 12 / 10 = 1
                                                                               // reversNum = reversNum * 10 + remainder
            reversNum = reversNum * 10 + remainder;                            //           = 12 * 10 + 1 == 121

            number /= 10;
        }

        if (originalNumber == reversNum)

            System.out.println(originalNumber + " :- is a Palindrome Number");

        else

            System.out.println(originalNumber + " :- is not a Palindrome Number");
    }
}
