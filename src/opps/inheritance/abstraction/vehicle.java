package opps.inheritance.abstraction;

public abstract class vehicle {
    int engineNumber;
    double price;
    public void displayinfo(vehicle vehicle){
        System.out.println("vehicle engine number is :  "+vehicle.engineNumber + " and price of the vehicle is : " +vehicle.price);
    }
    public abstract void servicing();

}
