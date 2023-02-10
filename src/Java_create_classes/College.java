package Java_create_classes;

public class College {
    String name;
    String place;
    int total_Student;
    int total_fees;
    public College (String name,String place, int total_Student, int total_fees){
        this.name = name;
        this.total_Student= total_Student;
        this.place= place;
        this.total_fees=total_fees;
    }
    public static void main(String [] args){
        College obj1 = new College("odv inter college","tundla",1500,35200);
        System.out.println("college name is: "+obj1.name +", "+"total_Student is: "+obj1.total_Student+", "+" college place of: "+ obj1.place+", "+"college's total_fees is: "+obj1.total_fees);
        College obj2 = new College("th biri singh inter college", "tundla", 2800,355522);
        System.out.println("college name is: "+obj2.name +", "+" total_Student is: "+obj2.total_Student+", "+" college place of: "+ obj2.place+", "+" college's total_fees is: "+obj2.total_fees);

    }
}
