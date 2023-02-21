package demo;

public class Array_withallloops {
    public static void main(String[] args) {
        //SYNTAX:Datatype varName[]={value1,value2,value3,...);
        String Brands[] = {"iPhone", "Samsung", "Redmi", "Nokia", "Vivo"};
        System.out.println("Printing All The Mobile Brands Using For Loop:");
        for (int i = 0; i < Brands.length; i++) {
            System.out.println(Brands[i]);
        }
        int i = 0;
        System.out.println("Printing All The Mobile Brands Using While Loop:");
        while (i < Brands.length) {
            System.out.println(Brands[i]);
            i++;
        }
        System.out.println("Printing All The Mobile Brands Using Advanced Loop:");
        for (String var : Brands) {
            System.out.println(var);
        }
        int age[] = {30, 25, 70, 22, 18};
        System.out.println("Printing age for loop");
        for (int j = 0; j < age.length; j++) {
            System.out.println(age[j]);
        }
        int j = 0;
        System.out.println("Printing age While loop");
        while (j < age.length) {
            System.out.println(age[j]);
            j++;
        }
        System.out.println("Printing age Advanced loop");
        for (int var : age) {
            System.out.println(var);
        }
        double Salary[] = {20235.65, 482.32, 5523.70, 6022.45};
        System.out.println("Printing Salary for loop");
        for (int a = 0; a < Salary.length; a++) {
            System.out.println(Salary[a]);
        }

        int a = 0;
        System.out.println("Printing Salary While loop");
        while (a < Salary.length) {

            System.out.println(Salary[a]);
            a++;
        }
        System.out.println("Printing Salary Advanced loop");
        for (double var : Salary) {
            System.out.println(var);
        }
    }


}




