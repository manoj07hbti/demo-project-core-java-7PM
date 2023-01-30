package conditional_statement;

public class And_Operator {


    public static void main(String[]args){

        int age=18;
        String city="Delhi";

        age=19;  city="Delhi";
  //True  & True == True  //

        if(age>18 & city=="Delhi"){

            System.out.println(" Person  Is Eligible For Voting In Metro City ");
        }
        else {
            System.out.println("Person Is Not Eligible For Voting In Metro City ");

        }
//True  &  False == False //

        city="mumbai";

        if(age>18 & city=="Bangalore"){

            System.out.println("Person  IS Eligible For Voting In Metro City");
        }
        else {
            System.out.println("Person Is NOt Eligible For Voting In Metro City ");
        }
  //False & True == False //

        age=16;
        city="Delhi";

        if(age>18 & city=="Delhi"){

            System.out.println("Person Is Eligible For Voting In Metro City");
        }
        else {
            System.out.println("Person Is Not Eligible Voting In Metro City ");

        }
// False & False == False //

        age=15;
        city="chennai";

        if(age>18 & city=="chennai"){
            System.out.println("Person Is Eligible For Voting In Metro City");
        }
         else {
             System.out.println("Person Is Not Eligible For Voting In Metro City ");

        }
    }
}
