package core_java_test;

public class Array_loop {

    //Write a program to print String Array of city using advanced loop//
    //SYNTAX : DataType varName [] = {Value1 , value2 , value 3}
    public static void main(String[] args) {
        String cities[] = {"Agra", "Delhi", "Jaipur", "Pune",};

        //SYNTAX : for (DataTYpe varName :ArrayName){
        //
        // }
        for (String var : cities) {
            System.out.println("Printing arrays using advanced loop  :" + var);
        }


    }
}
