package array;

import java.sql.SQLOutput;

public class ArrayOfBrands_Assign_20Feb {

    public static void main(String[] args) {


        //print brand name in array

        //SYNTAX:  Datatype varName [] = {value1,value2, value 3........};
        String BrandName[] = {"BMW", "Mercedes", "Toyota", "Tata", "KIA", "Maruti"};

        //using loop
        for(int i=0;i<BrandName.length;i++){
            System.out.println("print with loop : "+BrandName[i]);
        }
        //while loop
        int i=0;
        while (i<BrandName.length){
            System.out.println("print with While loop : " +BrandName[i]);
            i++;
        }
        //Advance loop
        //SYNTAX : for (Datatype varName : ArrayName){
        //
        //         }

        for(String var : BrandName){
            System.out.println("Print with Advance Loop " +var);
        }


    }

}
