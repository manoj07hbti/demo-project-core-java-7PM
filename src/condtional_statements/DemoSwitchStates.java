package condtional_statements;

public class DemoSwitchStates {
    public static void main(String[] args) {

        String state="PP";

        switch (state){

            case "MH":

                System.out.println("Maharashtra");
                break;

            case "UP":

                System.out.println("Uttar Pradesh");
                break;

            case "MP":

                System.out.println("Madhya Pradesh");
                break;

            case "RJ":

                System.out.println("Rajasthan");
                break;

            case "GU":

                System.out.println("Gujarat");
                break;

            case "JM":

                System.out.println("Jammu Kashmir");
                break;

            case "KL":

                System.out.println("Kerala");
                break;

                default:

                    System.out.println("Invalid State Print");



        }


    }
}
