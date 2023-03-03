package method_or_function;

public class MethodAdvance {

    // SYNTAX :- access_specifier return_type method_name(parameter)[code}

    public void makeSquare(){

        int number = 9;
        int square = number*number;
        System.out.println("Square of " +number + " is:- "+square);
    }

    // SYNTAX :- access_specifier return_type method_name (parameter){code}

    public void evenNumber(){

        for(int i=1; i<=50; i++){

            if (i % 2 == 0){

                System.out.println("Even number is " +i);
            }
        }
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){code}

    public void cubeNumber(){

        int number = 11;
        int cube = number*number*number;

        System.out.println("Cube of " +number + " is:- " +cube);
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void OddNumber(){

        for (int i=1; i<=100; i++ ){

            if(i % 2 != 0 ){

                System.out.println("Odd Number is " +i);
            }
        }
    }

    // SYNTAX :- access_specifier return_type method_name(parameter){Code}

    public void ValidVoter(){

        int age = 18;
        String city = "Agra";

        if (age>=18 & city=="Agra"){

            System.out.println("If the age of the person is " +age + " then it is eligible to vote in Agra");
        }

    }

    public static void main(String[] args) {

        // ClassName objName = new ClassName();
        // objName.methodName();

        MethodAdvance obj = new MethodAdvance();

        obj.makeSquare();
        obj.evenNumber();
        obj.cubeNumber();
        obj.OddNumber();
        obj.ValidVoter();
    }
}
