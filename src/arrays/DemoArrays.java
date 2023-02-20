package arrays;

public class DemoArrays {




    public static void main(String[] args) {


       //SYNTAX:  Datatype varName [] = {value1,value2, value 3........};

        String cities [] = { "Agra" , "Delhi" , "Jaipur", "Pune", "Kanpur","Mumbai","Jhanshi"};

        System.out.println(cities[1]);

        System.out.println(cities[5]);



        for (int i=0; i<cities.length; i++){

            System.out.println("Printing all elements in Loop : "+cities[i]);
        }

        int i=0;
        while (i<cities.length){

            System.out.println("Printing all elements in WHILE Loop : "+cities[i]);
            i++;
        }


        //SYNTAX : for (Datatype varName : ArrayName){

        //  }

        for (String var : cities){

            System.out.println("Printing using advanced loop  :"+var);
        }


        int marks[] = {35,23,55,76,82,56,7,8};

        for (int j=0; j< marks.length; j++){

            System.out.println("Printing marks "+marks[j]);
        }


        for (int var : marks){


            System.out.println("Printing using advance loop "+var);
        }
    }
}
