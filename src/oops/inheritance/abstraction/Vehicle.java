package oops.inheritance.abstraction;

public abstract class Vehicle {

    int engineNumber;
    double price;

    //common feature display vehicle information

    public void displayInfo(Vehicle vehicle){

        System.out.println("Vehicle details are: ..."+vehicle.engineNumber +" Price: "+vehicle.price);
    }

    // servicing
    public abstract void servicing();

}
