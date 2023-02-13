package Method_or_Function;

public class methodInputParam {
    // write a program to make a cube of given number
    public void makecube(int number){
        int cube = number*number*number;
        System.out.println("Cube of the given number is : "+cube);

    }

    public static void main(String[] args) {
        methodInputParam obj= new methodInputParam();
        obj.makecube(5);
        obj.makecube(8);
    }
}
