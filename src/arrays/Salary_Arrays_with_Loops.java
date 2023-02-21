package arrays;

public class Salary_Arrays_with_Loops {

    public static void main(String[] args) {

        //Assignment of arrays : Salary,..........normal loop , while loop , advanced loop

        //SYNTAX of arrays : DataType varName [] = {value 1 , value 2 , value 3.........}

        double salary[] = {34484.66, 55767.77, 76656.75, 64465.78, 99978.22,};

        //Printing salary with Normal loop

        for (int i = 0; i < salary.length; i++) {
            System.out.println("Printing salary with Normal Loop :" + salary[i]);
        }

        //Printing salary with While Loop
        int i = 0;
        while (i < salary.length) {
            System.out.println("Printing salary with While Loop :" + salary[i]);
            i++;
        }

        //Printing salary with Advanced Loop
        //SYNTAX : for(DataType VarName : ArrayName){
        //
        // }

        for (double Salary : salary) {
            System.out.println("Printing Salary with Advanced Loop :" + Salary);
        }
    }
}
