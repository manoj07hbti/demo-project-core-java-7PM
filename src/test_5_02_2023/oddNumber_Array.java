package test_5_02_2023;

public class oddNumber_Array {

    public static void main(String []args){


        // write a program to print array using advanced loop with odd number from 1 to 100 //


        int odd[]=new int[99];

        for(int i=0;i<99;i++)

            odd[i]=i+1;

        for(int g:odd) {

            if (g % 2 != 0)

                System.out.print(  " " +g);
        }
    }
}













