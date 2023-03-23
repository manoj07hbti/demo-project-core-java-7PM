package demo.Democlass;

public class Mathperimeter {
    private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;


        System.out.println("perimeter is =" + perimeter);
        System.out.println("perimeter is =" + area);
    }
}