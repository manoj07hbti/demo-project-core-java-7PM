package Methods;

public class Cube {
    int number=3,result;

    void cube(){
        result = number*number*number;
        System.out.println("Cube of "+number+" = "+result);
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        c.cube();
    }
}
