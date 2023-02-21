package condtional_statements;

public class DemoIf {
    public static void main(String[] args) {
        // if (expression or condition) {
        //         CODE
        //      }

        int age;

        age=19;

        if(age>18){
            System.out.println("Person is eligible for voting");
        }

        if(age<18){
            System.out.println("Person is not eligible for voting");
        }

        String CityName;

        CityName="Pune";

        if(CityName=="Agra"){
            System.out.println("Person belongs to Agra");
        }

        if(CityName!="Agra"){
            System.out.println("Person belongs to other city");
        }
}}
