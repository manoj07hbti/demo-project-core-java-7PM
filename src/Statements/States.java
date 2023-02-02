package Statements;

//Finding states using Short form
public class States {
    public static void main(String[] args){
        String State_Name = "MH";

        switch (State_Name){
            case "UP":
                System.out.println("Uttar Pradesh");
                break;
            case "MH":
                System.out.println("Maharashtra");
                break;
            case "DL":
                System.out.println("Delhi");
                break;
            default:
                System.out.println("Invalid State Entered");
        }
    }
}
