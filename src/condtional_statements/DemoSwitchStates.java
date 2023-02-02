package condtional_statements;

public class DemoSwitchStates {

    public static void main(String[] args) {

        String state="PUN";

        switch (state){

            case "MH":
                System.out.println("Maharashtra");
                break;

            case "DL":
                System.out.println("Delhi");
                break;
            case "UP":
                System.out.println("Uttar Pradesh");
                break;

            case "KL":
                System.out.println("Kerala");
                break;

            default:
                System.out.println("Invalid state entered.....");



        }

    }
}
