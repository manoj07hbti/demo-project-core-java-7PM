package arrays;

public class Demo_Arrays {


    public static void main(String[] args) {

        //SYNTAX of arrays : DataType varName [] = {value 1 , value 2 , value 3.........}

        // Storing cities names: Agra , Delhi , Jaipur , Pune , Kanpur , Mumbai

        String cities[] = {"Agra", "Delhi", "Jaipur", "Pune", "Kanpur", "Mumbai"};

        System.out.println(cities[1]);
        System.out.println(cities[5]);

        //Printing all the data of arrays with the help of loop...

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Printing all elements by use of FOR Loop :" + cities[i]);
        }

        //printing all the data of arrays with the help of while loop
        int i = 0;
        while (i < cities.length) {
            System.out.println("Printing all the elements by WHILE Loop :" + cities[i]);
            i++;
        }

        //Printing all the elements of arrays by the use of
        //advanced for loop only for arrays :
        //SYNTAX : for (Datatype varName : ArrayName){
        //
        // }

        for (String var : cities) {
            System.out.println("Printing using Advanced Loop :" + var);
        }


    }
}
