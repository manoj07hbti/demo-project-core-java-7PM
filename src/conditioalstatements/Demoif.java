package conditioalstatements;

import java.sql.SQLOutput;

public class Demoif {

    public static void main(String[] args) {

        int age;
        age=20;

        if (age>19){

            System.out.println("kumar is eligible for voting"  +age);
        }


        if (age>17){

            System.out.println("rahul is not eligible for voting " +age);
        }

        int marks=33;

        if (marks>=40){

            System.out.println("some studient gets above thirty persent :" +marks);

        }
        else {
            System.out.println("some studient get below 30 percent marks" +marks);
        }


        int mark=55;
        if (mark>=55){
            System.out.println("some student get second division " +mark);
        }

        else {
            System.out.println("some student get second division " +mark);
        }

        int mark1=60;
        if(mark1>60){
            System.out.println("some student get first division" +mark1);

        }
        else {
            System.out.println("some student get first division " +mark1);
        }








    }
}
