package ErrorMethod;

public class ErrorClass {

    public static void main(String[] args){

        String Brands []={"IBM","samsung","intex","Sony","micromax","Dell","HP","lenevo","Apple","panasonic"};

        System.out.println("top brand : "+Brands[5]);
        System.out.println(Brands[8]);
        System.out.println("print all brands: ");

        for(int i=1; i<Brands.length; i++){

            System.out.println(Brands[i]);

        }
        int i=0;
        while( i< Brands.length){
            System.out.println("print all people brands by use while loop :"+Brands[i]);
            i++;
        }
        for(String var: Brands){
            System.out.println("print all people brands by use advance for loop :"+var);
        }
    }
}
