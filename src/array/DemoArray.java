package array;

import java.sql.SQLOutput;

public class DemoArray {

    public static void main(String[] args) {

        ////SYNTAX:  Datatype varName [] = {value1,value2, value 3........};

        String CountryName[]={"INDIA" ,"JAPAN","KOREA" , "FRANCE", "CHINA", "BHUTAN"};
        System.out.println(CountryName [3]);
        System.out.println(CountryName[5]);

        //print with loop

        for (int i=0; i<CountryName.length; i++){
            System.out.println("Print all elements in loop  " +  CountryName[i]);

        }

        //print with while loop
        int i=0;
        while(i<CountryName.length) {
            System.out.println("Print with While Loop " + CountryName[i]);
            i++;
        }

        // print with Advance Loop
        //SYNTAX : for (Datatype varName : ArrayName){
        //
        //         }

        for(String var :CountryName){
            System.out.println("print with Advance Loop :" +var);
        }

        int marks[]={25 ,33,55 ,12 ,16 ,10, 88 , 66 ,96};

        //print with  loop
        for (int j=0; j<marks.length;j++){
            System.out.println("print with loop " +marks[j]);

        }
        //print with while loop



    }
}
