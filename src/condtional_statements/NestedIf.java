package condtional_statements;

public class NestedIf {

    public static void main(String[] args) {

        int number =33;

       if(number>0) {
           if (number % 2 == 0) {

               System.out.println("Number is Even ");
           }
           else {
               System.out.println("Number is ODD ");
           }


       }
       else {

           System.out.println("Number is less than zero ");
       }
    }

}
