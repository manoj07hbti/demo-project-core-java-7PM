package method_or_function;

public class MethodAdvance {

    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void makeSquare(){

        int number=3;

        int square=number*number;

        System.out.println("Square of 3 is "+square);
    }

    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void printEvenNumber(){

        for (int i=1; i<=50 ; i++){

            if(i%2 == 0){

                System.out.println("Even number is "+i);
            }
        }

    }

    public static void main(String[] args) {

        MethodAdvance obj= new MethodAdvance();

        obj.makeSquare();

        obj.printEvenNumber();

    }



}
