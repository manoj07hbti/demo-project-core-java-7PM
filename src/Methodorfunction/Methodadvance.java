package Methodorfunction;

public class Methodadvance {
    public void makecube(){

        int number=8;

        int cube=number*number*number;

        System.out.println("cube of 8 is" +cube);


    }
    public void printoddNUMBER(){


        for  ( int i=1; i<=100; i++){

            if (!(i % 2 == 0)){
                System.out.println("odd number is "+i);
            }
        }

    }

    public static void main(String[] args) {
        Methodadvance obj = new Methodadvance();
        obj.printoddNUMBER();
    }
        }
