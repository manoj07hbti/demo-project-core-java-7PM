package AA_Test_05March2023;

public class PrintEvenNumbers {

    public static void main(String[] args) {

        int a[] = new int[100];

        System.out.print("List of Even Numbers from 1 to 100 in the Array are : \n ");
        for (int j = 0; j < 100; j++)
            a[j] = j + 1;
        for (int i : a) {
            if (i % 2 == 0)
                System.out.print(i + "\n ");

        }
    }


}


