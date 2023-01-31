package conditional_statement;

public class Or_Operator {

    public static void main(String[]args){


        int age=19;
        String city="Agra";

        // true || true == true //

        age=20; city="Agra";

        if(age>18 || city=="Agra"){
            System.out.println("Person Is Eligible For Voting In Metro City ");

        }
        else {
            System.out.println("Person Is Not Eligible For Voting In Metro City ");
        }

// true || false == True //

        city="delhi";
        if(age>18  || city=="delhi"){
            System.out.println(" Person IS Eligible For Voting In Metro City ");

        }
        else {
            System.out.println("Person Is Not Eligible For Voting In Metro City  ");
        }
// False || True == True //
        age=16;
        city="Agra";

        if(age>18 || city=="Agra"){
            System.out.println("Person Is Eligible For Voting In Metro City ");
        }
        else {
            System.out.println("Person Is Not Eligible For Voting In Metro City ");

        }
// False  || False == False //

        age=11;
        city="Mumbai";

        if(age>18  || city=="Delhi"){
            System.out.println("Person Is Eligible For voting IIn Metro City ");

        }
        else {
            System.out.println("Person Is Not Eligible For Voting In Metro City ");
        }





    }






}
