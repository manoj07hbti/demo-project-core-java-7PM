package method_or_function;

public class Voting {

    //voting

    public void votingMethod() {
        int age;
        String city;
        age = 19;
        city = "Agra";

        if (age >= 18 & city == "Agra") {
            System.out.println("Person is eligible voting in Agra");
        }

    }

    public static void main(String[] args) {
        //SYNTAX 1 : ClassName objName = new ClassName();
        Voting obj = new Voting();
        //SYNTAX : objName.methodName();
        obj.votingMethod();
    }
}
