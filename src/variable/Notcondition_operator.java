package variable;

public class Notcondition_operator {
    public static void main(String[] args) {
        String brand = "IBM";
        int price = 850;
        if (!(price<=1000)) {
            System.out.println("Low price product");
        }
    else{
            System.out.println("Product is not low price");

        }
    price =2500;
    if(!(price<=5000)){
        System.out.println("Product is medium price");
    }
    else{
        System.out.println("Product is not medium price");
    }
    price =5000;
    if(!(price>5000)){
        System.out.println("Product is high price");
    }
    else{
        System.out.println("Product is not high price");
    }
    }
}