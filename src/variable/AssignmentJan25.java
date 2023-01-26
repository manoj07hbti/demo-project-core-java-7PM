package variable;

public class AssignmentJan25 {
    public static void main(String args[]) {

        // 1.Write a program to print Country,Population,Number of States//

        //Country//
        String Country;
        Country = "India";
        System.out.println("My country name is : " + Country);

        //Population//
        double population;
        population = 1.42;
        System.out.println("Population in India is : " + population + (" Billion"));

        //Number of States//
        int numberofstates;
        numberofstates = 28;
        System.out.println("There are " + numberofstates + (" number of states in India"));

        // 2.Cube of 5 //

        int a = 5;
        int multi = a * a * a;
        System.out.println("Cube of 5 is : " + multi);

        // 3.Find the 5% of 34550 ? //

        int number = 34550;
        int percent = 5;
        double result = (double) (number * percent) / 100;
        System.out.println("5% of 34550 is : " + result);


    }
}
