package conditional_statements;

public class Assignment_2_Feb_Switch_Statement {

    public static void main(String[] args) {

        //Write a program which tells about you name of month based on your month number//
        // 1. January, 2.February, 3.March, 4.April, 5.May, 6.June, 7.July
        // 8.August, 9.September, 10.October, 11.November, 12.December

        int month;
        month = 7;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month day entered...");
        }
    }
}
