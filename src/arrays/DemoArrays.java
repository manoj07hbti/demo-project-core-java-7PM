package arrays;

public class DemoArrays {


    public static void main(String[] args) {

        // SYNTAX :- DataType varName [] = {value 1, value 2, value 3,.......};

        String Cities [] = {"Agra","Kanpur","Delhi","Jaipur","Pune","Firozabad"};
        int Age [] = {24,26,28,22,19,29,31,18,34};

        // FOR PRINT ONE BY ONE
        // SYNTAX :- System.out.println(varName[INDEX NUMBER]);

        System.out.println(Cities[0]);
        System.out.println(Cities[1]);
        System.out.println(Cities[2]);
        System.out.println(Cities[3]);
        System.out.println(Cities[4]);
        System.out.println(Cities[5]);

        System.out.println(Age[0]);
        System.out.println(Age[1]);
        System.out.println(Age[2]);
        System.out.println(Age[3]);
        System.out.println(Age[4]);
        System.out.println(Age[5]);
        System.out.println(Age[6]);
        System.out.println(Age[7]);
        System.out.println(Age[8]);



        // PRINT WITH FOR LOOP
        // BECAUSE FOR LOOP PRINTS ALL DATA AT ONCE
        // SYNTAX as an example :-  for(int i=0; i<varName.length; i++){
        //                               System.out.println("TEXT:- "+varName[i]);
        //                          }

        for (int i=0; i<Cities.length; i++){

            System.out.println("Print with 'FOR LOOP':- "+Cities[i]);
        }

        for (int j=0; j<Age.length; j++){

            System.out.println("Print with 'FOR LOOP' :- "+Age[j]);
        }

        // PRINT WITH WHILE LOOP
        // BECAUSE WHILE LOOP PRINTS ALL DATA AT ONCE
        // SYNTAX as an Example :- int i=0;
        //                         while(i<varName.length){
        //                            System.out.println("TEXT:- "+varName[i]);
        //                            i++;
        //                         }

        int i=0;
        while (i<Cities.length){

            System.out.println("Print with 'WHILE LOOP' :- "+Cities[i]);
            i++;
        }

        int j=0;
        while (j<Age.length){

            System.out.println("Print with 'WHILE LOOP' :- "+Age[j]);
            j++;
        }

        // PRINT WITH ADVANCE FOR LOOP
        // BECAUSE ADVANCE FOR LOOP PRINTS ALL DATA AT ONCE
        // SYNTAX :- for(DataType varName : ArrayVarName){
        //              System.out.println("TEXT:- "+varName);
        //           }

        for (String var : Cities){

            System.out.println("Print with 'ADVANCE FOR LOOP' :- "+var);
        }

        for (int var : Age){

            System.out.println("Print with 'ADVANCE FOR LOOP' :- "+var);
        }

        // ASSIGNMENT:-------------------------------------------------

        String Brande [] = {"Sony","Samsung","LG"};
        int age [] = {34,54,76,76};
        double salary [] = {37685.50,43526.70,56478.98};

        for (i=0; i<Brande.length; i++){

            System.out.println("Print Brand by for loop:- "+Brande[i]);
        }

        for (j=0; j<age.length; j++){

            System.out.println("Print age by for loop:- "+age[j]);
        }

        for (int k=0; k<salary.length; k++){

            System.out.println("Print salary by for loop:- "+salary[k]);
        }

        i=0;
        while (i<Brande.length){

            System.out.println("Print Brand by while loop:- "+Brande[i]);
            i++;
        }

        j=0;
        while (j<age.length){

            System.out.println("Print age by while loop:- "+age[j]);
            j++;
        }

        int k=0;
        while (k<salary.length){

            System.out.println("Print salary by while loop:- "+salary[k]);
            k++;
        }

        for (String var : Brande){

            System.out.println("Print Brand by Advance for loop:- "+var);
        }

        for (int var : age){

            System.out.println("Print age by Advance for loop:- "+var);
        }

        for (double var : salary){

            System.out.println("Print salary by Advance for loop:- "+var);
        }











    }
}
