package method_or_function.method_or_function;

public class InputMethodAssigment {

    public void checkPrime( int number) {

        if (number % 2 == 0) {

            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }

        }
        public void Facto(int fact) {

            System.out.println("this is factorial of :"+fact);
             for(int i=fact; i>0; i--){

                 System.out.println(i);
             }
        }
        public void Percent(int  number, int radio){

            double b= (double) (number*radio)/100;

            System.out.println(b);
        }
            public static void main(String args[]){
                InputMethodAssigment obj=new InputMethodAssigment();

                obj.checkPrime(12);

                obj.Facto(6);

                obj.Percent(1000,10);

    }
        }


































