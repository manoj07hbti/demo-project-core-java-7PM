package conditional_statements;

public class Switch_Statement {
    public static void main(String[] args) {
        //Write a program which tells about you Day of Week based on day number//
        // 1.Sunday
        // 2.Monday
        // 3.Tuesday
        // 4.Wednesday
        // 5.Thursday
        // 6.Friday
        // 7.Saturday

        int day;
        day = 7;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day entered...");
        }

        //Write a program which tell state name by using initials//
        // MH : Maharashtra
        // UP : Uttar Pradesh
        // DL : Delhi

        String state;
        state = "UP";
        switch (state) {
            case "MH":
                System.out.println("Maharashtra");
                break;
            case "DL":
                System.out.println("Delhi");
                break;
            case "UP":
                System.out.println("Uttar Pradesh");
                break;
            default:
                System.out.println("Invalid State entered..");

        }


    }
}

