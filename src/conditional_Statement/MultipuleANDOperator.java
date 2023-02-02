package conditional_Statement;

public class MultipuleANDOperator {
    public static void main(String[] args) {
        int age;
        String city;
      age=20;
      city="mumbai";
      //TRUE & TRUE = TRUE//
      if (age>18 & city=="mumbai"){
          System.out.println("person is eligible for voting in mumbai" + age);
      }
      else{
          System.out.println("person is not eligible for voting in mumbai" +age);
      }
      //TRUE & FALSE= FALSE//
        if (age>18 & city=="Delhi"){
            System.out.println("person is eligible for voting in delhi" + age);
        }
        else{
            System.out.println("person is not eligible for voting in delhi" + age);
        }
        //FALSE & FALSE= FALSE//
        if (age>18 & city=="Chennai"){
            System.out.println("person is eligible for voting in chennai" + age);
        }
        else{
            System.out.println("person is not eligible for voting in chennai" + age);
        }
    }
}
