package method_or_function;

public class Square_and_cube {

    //Create a method print square and cube of given numbers//

    //SYNTAX : access_specifier return_type method_name (parameter) {CODE...}

    public void makingSquare() {
        int number;
        number = 5;
        int square = number * number;
        System.out.println("Square is 5 : " + square);
    }

    public void makingCube() {
        int number;
        number = 6;
        int cube = number * number * number;
        System.out.println("Cube is 6 : " + cube);
    }

    public static void main(String[] args) {
        //SYNTAX : ClassName objName = new ClassName();
        Square_and_cube obj = new Square_and_cube();
        //objName.methodName();
        obj.makingSquare();
        obj.makingCube();
    }

}
