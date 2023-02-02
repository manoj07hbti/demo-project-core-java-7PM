package Conditional_statement;

public class NOtoperator_Assignment31jan {

    public static void main(String[] args) {

        //price<1000 : low price product;

 String Brand="IBM";
 int price=2000;

 if(Brand=="IBM" || price>1000){
     System.out.println("BRAND =" +Brand +  "PRICE = "+price);
     System.out.println("this is lowest price product");
 }
else{
    System.out.println("this is not lowest price product");
 }
        //price>1000 and <5000  : medium range product
        if(price>1000 & price <5000){
            System.out.println("product price is medium");
        }
        else{
            System.out.println("product price is higher");
        }
        //price>5000 high price product
        if(!(price>5000)){
            System.out.println("BRAND = " + Brand  +"   PRICE =" + price);
            System.out.println("Price is higher");
        }
    }
}
