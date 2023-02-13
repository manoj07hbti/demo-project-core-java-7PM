package method_or_function;

public class Cube_Assign {

    //find the cube of given number
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void makeCube(){
        int num=8;
        int cube=num*num*num;
        System.out.println("Cube of given Number is : " + cube);

    }

    // print odd number between 1 to 100
    ////Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void printOddNumber(){

        for(int i=1; i<=100; i++){

            if(!(i%2==0)){
                System.out.println("Od Number is : " + i);
            }
        }
    }


    public static void main(String[] args) {

        Cube_Assign obj=new Cube_Assign();
        obj.makeCube();
        obj.printOddNumber();
    }

}
