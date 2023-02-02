package conditional_statements;

public class Demo_If_or_else_comditional_statement {
    public static void main(String[] args){

        // 1.Write a code to check any number is divisible by 5//

        int number;
        number = 34;
        if (number % 5 == 0) {
            System.out.println("number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }

        // 2.Write a code if country is India print INDIAN else FOREIGNER//

        String country;
        country="India";
        if(country=="India"){
            System.out.println("Indian");
        }
        else{
            System.out.println("FOREIGNER");
        }


    }
}
