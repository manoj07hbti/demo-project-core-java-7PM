package conditional_statement;

public class Ashish_Assignment5 {
    public static void main(String[] args) {
        int age= 21;
        String city= "MUMBAI";
        if ((age>18)&&(city=="DELHI")){
            System.out.println("age = " +age +" Metro city = " +city);
            System.out.println("Person is eligible for voting in Metro City");
        }
        else if ((age>18)&&(city=="MUMBAI")){
            System.out.println("age = " +age +" Metro city = " +city);
            System.out.println("Person is eligible for voting in Metro City");
        }
        else if ((age>18)&&(city=="CHENNAI")){
            System.out.println("age = " +age +" Metro city = " +city);
            System.out.println("Person is eligible for voting in Metro City");
        }
        else if ((age>18)&&(city=="BANGALORE")){
            System.out.println("age = " +age +" Metro city = " +city);
            System.out.println("Person is eligible for voting in Metro City");
        }
        else{
            System.out.println("age = " +age +" Non-Metro city = " +city);
            System.out.println("Person is NOT eligible for voting in Metro City");
        }
    }
}
