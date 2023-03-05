package method_or_function;

public class Test1st {

    public void prime(int num){

        boolean flag = true;

        for (int i=2; i<=num; i++){

            if (num % i == 0){

                flag = false;

            }
        }
        if (flag){

            System.out.println("This is prime number:- "+num);
        }
        else {

            System.out.println("This is not prime number:- "+num);
        }
    }

    public void valid_voter(int age, String city){

        if(age<=18 & city=="Agra"){

            System.out.println("Person is eligible for voting");
        }
        else {

            System.out.println("Person is not eligible for voting");
        }
    }

    public static void main(String[] args) {

        Test1st obj = new Test1st();

        obj.prime(87);
        obj.valid_voter(18,"Agra");
    }
}
