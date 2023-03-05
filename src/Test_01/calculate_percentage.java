package Test_01;
import java.util.Scanner;
public class calculate_percentage {
    public double per(double a, double b){
        double result;
        result = (a*b)/100;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("write a method which calculate percentage ");
        Scanner sc= new Scanner(System.in);

        double number;
        double percentage;
        System.out.print("Enter number : ");
        number = sc.nextDouble();
        System.out.print("Enter how much percentage, you want to calculate --- percentage: ");
        percentage = sc.nextDouble();
        calculate_percentage obj = new calculate_percentage();
        double cal_per;

        cal_per = obj.per(number, percentage );
        System.out.println("Final result of the percentage : " +cal_per);
        
    }
}
