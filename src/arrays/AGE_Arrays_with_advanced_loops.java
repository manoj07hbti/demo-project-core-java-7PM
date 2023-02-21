package arrays;

public class AGE_Arrays_with_advanced_loops {

    public static void main(String[] args) {

        //Assignment of arrays : Age,..........normal loop , while loop , advanced loop

        //SYNTAX of arrays : DataType varName [] = {value 1 , value 2 , value 3.........}

        int age[] = {25, 64, 56, 35, 67, 76, 57, 34,};

        //Printing with normal loop

        for (int i = 0; i < age.length; i++) {
            System.out.println("Printing age with Normal Loop :" + age[i]);
        }

        //Printing age with While Loop
        int i = 0;
        while (i < age.length) {
            System.out.println("Printing age with While Loop :" + age[i]);
            i++;
        }

        //Printing age with Advanced Loop
        //SYNTAX : for(DataType VarName : ArrayName){
        //
        // }

        for (int Age : age) {
            System.out.println("Printing with Advanced Loop :" + Age);
        }
    }
}
