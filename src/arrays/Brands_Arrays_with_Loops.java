package arrays;

public class Brands_Arrays_with_Loops {


    public static void main(String[] args) {

        //Assignment of arrays : brands,..........normal loop , while loop , advanced loop

        //SYNTAX of arrays : DataType varName [] = {value 1 , value 2 , value 3.........}

        String brands[] = {"Sony", "Iphone", "Samsung", "Oppo", "Vivo", "Redmi", "Lava", "One Plus"};

        //Printing with normal loop
        for (int i = 0; i < brands.length; i++) {
            System.out.println("Printing all the Brands name by Normal Loop :" + brands[i]);
        }

        //Printing with while loop
        int i = 0;
        while (i < brands.length) {
            System.out.println("Printing all brands names by While Loop :" + brands[i]);
            i++;
        }

        //Printing with Advanced loop
        //SYNTAX : for(DataType varName : ArraysName){
        //
        // }

        for (String var : brands) {
            System.out.println("Printing all brands with Advanced Loop :" + var);
        }

    }
}
