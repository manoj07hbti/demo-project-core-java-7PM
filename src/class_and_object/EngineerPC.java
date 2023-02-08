package class_and_object;

public class EngineerPC {
    //    pesonalized constructor
    String name;
    int age;
    String branch;
    String bestIn;
    public EngineerPC(String name, int age, String branch, String bestIn) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.bestIn = bestIn;
    }

    public static void main(String[] args) {
        EngineerPC student1 = new EngineerPC("Ashish", 27, "Power system", "Maths");
        EngineerPC student2 = new EngineerPC("Mahesh", 27, "electrical", "circuit analysis");
        System.out.println("Name of student : " +student1.name +", Age : " + student1.age +" , Branch : " +student1.branch);
        System.out.println("Name of student : " +student2.name +", Age : " + student2.age +" , Branch : " +student2.branch);
    }
}
