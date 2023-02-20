package method_or_function;

public class MethodReturnType {

    // write a masage to give welcome massage
public String Welcome( String name){
    String message="Welcome to java Programming :" +name;
    return message;
}

//write a method which make cube of number and return
    public int Cube(int number){
    int cube=number*number*number;

    return cube;
    }

    // write a method which calculate percentage
    public double Percentage(double number, double ratio){
    double percentage=((double)(number)*(double) (ratio))/100;
    return percentage;
    }
    public static void main(String[] args) {
        MethodReturnType obj=new MethodReturnType();
        String output=obj.Welcome("Sumit");
        System.out.println(output);
        int Cube=obj.Cube(6);
        System.out.println("Cube of Number: " +Cube);
        double percentage= obj.Percentage(500, 50);
        System.out.println("percenatage of given number is : " +percentage);
        }


}
