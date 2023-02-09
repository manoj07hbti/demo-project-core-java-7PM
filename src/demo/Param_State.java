package demo;

public class Param_State {
    String name;
    int cities;
    String food;


    public Param_State(String name, int cities, String food) {
        this.name = name;
        this.cities = cities;
        this.food = food;
    }
        public static void main(String[] args){

            Param_State obj1= new Param_State("Maharashtra",25,"Vada pav");
            System.out.println("Name is: "+obj1.name + " cities is: "+obj1.cities +" food is: "+obj1.food);

            Param_State obj2= new Param_State("Rajasthan",24,"Daal baati churma");
            System.out.println("Name is: "+obj2.name + " cities is: "+obj2.cities+" food is: "+obj2.food);
        }
    }

