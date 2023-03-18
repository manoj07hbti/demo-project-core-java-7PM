package statements;

//Using Method
public class FindingDayUsing_Method {
    int day=6;
    void Day() {
        //void Day(int day) {
        switch (day) {
            case 1:
                System.out.println("The Day is Sunday");
                break;
            case 2:
                System.out.println("The Day is Monday");
                break;
            case 3:
                System.out.println("The Day is Tuesday");
                break;
            case 4:
                System.out.println("The Day is Wednesday");
                break;
            case 5:
                System.out.println("The Day is Thursday");
                break;
            case 6:
                System.out.println("The Day is Friday");
                break;
            case 7:
                System.out.println("The Day is Saturday");
                break;
            default:
                System.out.println("Invalid Day Entered");
        }
    }
    public static void main(String[] args){
        FindingDayUsing_Method f= new FindingDayUsing_Method();
        f.Day();
        //f.Day(4);
    }
}
