package Andopperator;

public class andopperator1 {

    public static void main(String[] args) {
        int age;
        String city;

        age=19;
        city="bangelore";

        if (age>18 & city=="bangelore"){
            System.out.println("person is eligible for voting in metro city");

        }
        else{
            System.out.println("person is not eligible for voting in metro city");
        }

        city="Delhi";
        if (age>18 & city=="bangelore"){
            System.out.println("person is eligible for voting in metro city");
        }
        else {
            System.out.println("person is not eligible for voting in metro city");
        }

        age=16;
        if (age>18 & city=="bengelore"){
            System.out.println("person is eligible for voting in metro city");
        }
        else{
            System.out.println("person is not eligible for voting in metro city");
        }
        age=14;
        city="agra";
        if (age>14 & city=="DELHI"){
            System.out.println("person is eligible for voting in metro city");
        }
        else {
            System.out.println("person is not eligible for voting in metro city");
        }






    }
}
