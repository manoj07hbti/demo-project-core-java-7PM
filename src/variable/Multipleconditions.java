package variable;

public class Multipleconditions {
    public static void main(String[] args) {
        int age;
        String city;
        age=18; city="Mumbai";
        if(age>=18 & city == "Mumbai") {
            //TRUE & TRUE= TRUE//
            System.out.println("Person is eligible for voting in metro city");

        } else {
            System.out.println("Person is not eligible for voting in metro city");
        }
        //TRUE & FALSE= FALSE//
        age = 18;
        city = "Raipur";
        if (age > 18 & city == "Pune") {

            System.out.println("Person is eligible for voting in metro city");
        } else {
            System.out.println("Person is not eligible for voting in metro city");
        }
        //FALSE & TRUE=FALSE//
        age = 10;
        city = "Chennai";
        if (age > 15 & city == "Chennai") {

            System.out.println("Person is eligible for voting in metro city");
        } else {
            System.out.println("Person is not eligible for voting in metro city");
            //FALSE & FALSE =FALSE//
            age = 16;
            city = "Agra";
            if (age > 16 & city == "Agra") {

                System.out.println("Person is eligible for voting in metro city");
            } else {
                System.out.println("Person is not eligible for voting in metro city");


            }
        }
    }
}