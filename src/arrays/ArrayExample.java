package arrays;

public class ArrayExample {

    public static void main(String[] args) {
        String Brands[] = {"Toyota", "Mercedes", "Tata", "Maruti"};

        System.out.println(Brands[2]);
        System.out.println(Brands[3]);

        System.out.println("Printing All Elements of Array :");
        for(int i=0;i<Brands.length;i++){
            System.out.println(Brands[i]);
        }

        System.out.println("Printing All Elements of Array Using While loop :");
        int i=0;
        while(i<Brands.length){
            System.out.println(Brands[i]);
            i++;
        }
        System.out.println("Printing All Elements of Array Using Advanced for loop :");
        for(String var : Brands){
            System.out.println(var);
        }
    }

}
