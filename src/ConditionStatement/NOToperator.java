package ConditionStatement;

public class NOToperator {
    public static void main(String args[]){
        String city;
        city="DELHI";
        if ( !(city=="DELHI") ){

            System.out.println("Persan is DELHI");
        }
        else{
            System.out.println("Persan is AGRA");
        }
        int age;
        age=23;
        if( !(age>18) ){

            System.out.println("eligible for voting");
        }
        else{

            System.out.println("not eligible for voting");
        }





    }
}
