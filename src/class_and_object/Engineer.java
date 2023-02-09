package class_and_object;

public class Engineer {

    String name="Rahul";
    String college="R.b college";
    String qualification="B.tech";
    String city="Lucknow";
    String company="T.C.S";
    int salary=60000;


    public static void main(String[] args) {

        Engineer obj1=new Engineer();
        System.out.println("engineer name "+obj1.name);

        Engineer obj2=new Engineer();
        System.out.println("college name "+obj1.college);

        Engineer obj3=new Engineer();
        System.out.println("qualification "+obj1.qualification);

        Engineer obj4=new Engineer();
        System.out.println("city "+obj1.city);

        Engineer obj5=new Engineer();
        System.out.println("company "+obj1.company);

        Engineer obj6=new Engineer();
        System.out.println("salary "+obj1.salary);
    }


}
