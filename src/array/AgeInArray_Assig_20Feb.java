package array;

public class AgeInArray_Assig_20Feb {


    public static void main(String[] args) {

        //SYNTAX:  Datatype varName [] = {value1,value2, value 3........};

        int Age[]={28,35,22,16,36,45,75,12,40};
        //loop
        for (int i=0;i<Age.length;i++){
            System.out.println("print with loop "+Age[i]);
        }
        //while loop

        int i=0;
        while(i<Age.length){
            System.out.println("PRint with while loop "+Age[i]);
            i++;

        }
        //Advance loop
        // SYNTAX : for (Datatype varName : ArrayName){
        //              }
        for(int var :Age){
            System.out.println("print with Advanece loop " +var );

        }

    }
}
