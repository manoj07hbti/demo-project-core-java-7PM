package Statements;

public class Assignment_31st_Jan {
    public static void main(String[] args){
        //Checking Product using price

        String brand = "IBM", product = "Data_Analyst", product1 = "Database Engineer",  product2 = "Java Developer";
        //String brand = "IBM", product = "Low Price Product", product1 = "Medium Price Product",  product2 = "High Price Product";
        int price = 6000;

        if(brand=="IBM") {
            if (price < 1000) {
                System.out.println("Your Product is " +product);
                //System.out.println("Low Price Product");
            }
            if (price > 1000 & price < 5000) {
                System.out.println("Your Product is " +product1);
                //System.out.println("Medium Price Product");
            }
            if (price > 5000) {
                System.out.println("Your Product is " + product2);
                //System.out.println("High Price Product");
            }
        }
        else{
            System.out.println("Brand Mismatch");
        }
    }
}
