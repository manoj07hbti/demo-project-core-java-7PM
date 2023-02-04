package javaAssignment;

public class And_Condition {
    public static void main(String[] args){

        // use of & operator
        // then product price <1000 of ibm brand

        String brand;
        int price;
        brand ="ibm";
        price= 500;

        if (price<1000 & brand=="ibm"){
            System.out.println("low price product");
        }
        else{
            System.out.println("medium price product");
        }
        price= 4500;
        if(price>1000 & price<5000 & brand== "ibm"){
            System.out.println("medium price product");
        }
        else{
            System.out.println("high price product");
        }
        price=8000;
        if (price>5000){
            System.out.println("high price product");
        }
        else{
            System.out.println("Expansive product");
        }

    }
}
