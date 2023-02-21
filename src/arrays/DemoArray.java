package arrays;

public class DemoArray {

    public static void main(String[] args) {

        String Brands [] = {"Adidas", "Nike", "Puma", "Lotto", "Skechers", "Reebok"};

        System.out.println(Brands[0]);
        System.out.println(Brands[1]);
        System.out.println(Brands[2]);
        System.out.println(Brands[3]);
        System.out.println(Brands[4]);
        System.out.println(Brands[5]);


        for (int i=0; i<Brands.length; i++){

            System.out.println("Printing all brands name in loop: "+Brands[i]);
        }

        int i=0;
        while (i<Brands.length){

            System.out.println("Printing all brands name in while loop: "+Brands[i]);
            i++;
        }


        for (String var : Brands){

            System.out.println("Printing all brands in advance loop : " +var);
        }

    }
}
