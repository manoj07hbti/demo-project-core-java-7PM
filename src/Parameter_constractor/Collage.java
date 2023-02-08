package Parameter_constractor;

public class Collage {

    String Name;
    String City;
    int Timing;
    double fee;

    public Collage(String name, String city, int timing, double fee) {
        Name = name;
        City = city;
        Timing = timing;
        this.fee = fee;
    }

    public static void main(String[] args) {

        Collage obj1=new Collage("Agra Collage","Agra",10 ,1000);

        System.out.println("Collage Name is : " +obj1.Name + "City is : " +obj1.City +"Timing is : " +obj1.Timing +"Fee is : " +obj1.fee);

        Collage obj2= new Collage("St.Johns","Agra",9,5000);
        System.out.println("Collage Name is : " +obj2.Name + "City is : " +obj2.City +"Timing is : " +obj2.Timing +"Fee is : " +obj2.fee);}
}
