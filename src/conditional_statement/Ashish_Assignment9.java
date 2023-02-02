package conditional_statement;

public class Ashish_Assignment9 {
    public static void main(String[] args) {
        String city = "DL";
        switch (city){
            case "MH":
                System.out.println("Maharshtra");
                break;
            case "UP":
                System.out.println("Uttra Preadesh");
                break;
            case "DL":
                System.out.println("Delhi ");
                break;
            default:
                System.out.println("Entered city is invalid!");
                break;
        }
    }
}
