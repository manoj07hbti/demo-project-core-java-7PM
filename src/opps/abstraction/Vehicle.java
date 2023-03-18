package opps.abstraction;

public abstract class Vehicle {

    int engine_number;
    double price;

    public void displayinfo(Vehicle vehicle){
        System.out.println("Engine Number : "+vehicle.engine_number+" Price : "+vehicle.price);
    }

    public abstract void servicing(double price);
}
