package method_or_function;

public class Voting_Assign {

    //person is eligible for voting   if (age>= 18 & city=="Agra")

    public void EligibleForVoting(){
        String city="Agra";
        int age=19;
        if(age>=18 & city=="Agra"){
            System.out.println("Person is Eligible for Voting:" +age +city);
        }
        else{
            System.out.println("Person is not eligable for voting");
        }


    }

    public static void main(String[] args) {
        Voting_Assign obj=new Voting_Assign();
        obj.EligibleForVoting();
    }
}
