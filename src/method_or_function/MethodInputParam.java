package method_or_function;

public class MethodInputParam {

//access_specifier return_type  method_name (Datatype varName1,Datatype varName2........) {CODE..}

    public void makeCube(int number){

        int cube= number*number*number;

        System.out.println("CUbe of number is : "+cube);

    }

    public void voting(int age, String city){

        if(age>=18 & city=="AGRA"){

            System.out.println("Eligible for voting in Agra");
        }
        else {

            System.out.println("Not Eligible for voting in Agra..");
        }

    }

    public void checkEvenOdd(int number){

        if(number%2==0){

            System.out.println("Number is even number "+number);
        }
        else {

            System.out.println("Number is Odd Number "+number);
        }

    }

    public static void main(String[] args) {
        MethodInputParam obj= new MethodInputParam();

        obj.makeCube(3);
        obj.makeCube(5);


        obj.voting(17,"AGRA");
        obj.voting(21,"AGRA");

        obj.checkEvenOdd(3);
        obj.checkEvenOdd(8);

    }

}
