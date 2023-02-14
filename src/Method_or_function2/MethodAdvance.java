package Method_or_function2;

public class MethodAdvance {
    public void Makecube(){

        int number=7;

        int cube=number*number*number;

        System.out.println("cube of 7 is "+cube);
    }

    public void printOddNumber() {

        for (int i=1; i<=100; i++){

            if (!(i % 2 == 0)) {
                System.out.println("Odd number is "+i);
            }
        }
    }

    public static void main(String[] args) {
        MethodAdvance obj= new MethodAdvance();
        obj.Makecube();
        obj.printOddNumber();
    }


}
