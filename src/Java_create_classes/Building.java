package Java_create_classes;

public class Building {
    String place;
    String dept;
    int family;
    int income;
    public Building (String place,String dept, int family, int income){
        this.place = place;
        this.family = family;
        this.dept= dept;
        this.income = income;
    }
    public static void main(String [] args){
        Building obj1 = new Building("vijaywara","maintenance",8,35200);
        System.out.println("obj place is: "+obj1.place +" "+"obj family is: "+obj1.family+" "+"obj dept of "+ obj1.dept+" "+"obj income is: "+obj1.income);
        Building obj2 = new Building ("amratsar ", "construction ", 12,355522);
        System.out.println("obj place is: "+obj2.place +" "+"obj family is: "+obj2.family+" "+"obj dept of "+ obj2.dept+" "+"obj income is: "+obj2.income);

    }
}
