package Oroperator1;

public class Orperator {

    public static void main(String[] args) {

        int age;
        String city;

        age=20;
        city="DELHI";

        if(age>18 || city=="DELHI"){
            System.out.println("person is eligible for voting in metro city");

        }
        else{
            System.out.println("person is not eligible for voting in metro city");
        }

        city="BANGLORE";
        if(age>18 || city=="DELHI"){
            System.out.println("person is eligible for voting in metro city");
        }
        else{
            System.out.println("person is not eligible for voting in metro city");
        }

        age=14;
        city="CHENNAI";
        if(age>18 || city=="CHENNAI"){
            System.out.println("person is eligible for voting in metro city");
        }
        else{
            System.out.println("person is not eligible for voting in metro city ");
        }

        age=16;
        city="agra";
        if(age>18 || city=="DELHI"){
            System.out.println("person is eligible for voting in metro city");

        }
        else{
            System.out.println("person is not eligible for voting in metro city");
        }


    }
}
