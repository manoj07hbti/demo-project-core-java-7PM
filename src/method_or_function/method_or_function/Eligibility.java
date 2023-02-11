package method_or_function.method_or_function;

public class Eligibility {

    int age=17;
    String city="Delhi";

    public void checkvoteEligibility(){

        if(age>=18 &  city=="Delhi"){

            System.out.println("Person is eligible for voting");
        }

        else{

            System.out.println("Persan is not eligible for voting");
        }
    }
        public static void main(String args[]){

            // SYNTAX className objectName = new className();

                Eligibility obj =new Eligibility();

                  obj.checkvoteEligibility();
        }





}
