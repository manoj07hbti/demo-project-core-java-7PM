package arrays;

public class SalaryExample {

    public static void main(String[] args) {
        double Salary[] = {232.4, 2000.32, 3654.87, 786.90};

        System.out.println(Salary[2]);
        System.out.println(Salary[3]);

        System.out.println("Printing All Elements of Array :");
        for(int i=0;i<Salary.length;i++){
            System.out.println(Salary[i]);
        }

        System.out.println("Printing All Elements of Array Using While loop :");
        int i=0;
        while(i<Salary.length){
            System.out.println(Salary[i]);
            i++;
        }
        System.out.println("Printing All Elements of Array Using Advanced for loop :");
        for(double var : Salary){
            System.out.println(var);
        }
    }

}