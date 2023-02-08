package class_and_object;

public class Doctor {
    String Name="Azaan";
    String degree="B.U.M.S";
    String city="Aligarh";
    int salary=100000;


    public static void main(String[] args) {
        Doctor obj1=new Doctor();
        System.out.println("Doctor Name "+obj1.Name);
        Doctor obj2=new Doctor();
        System.out.println("Degree "+obj1.degree);
        Doctor obj3=new Doctor();
        System.out.println("City "+obj1.city);
        Doctor obj4=new Doctor();
        System.out.println("Salary "+obj1.salary);
    }
}
