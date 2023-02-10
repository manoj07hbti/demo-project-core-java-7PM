package Java_create_classes;

public class Engineer {
    String name;
    String dept;
    int age;
    int salary;
    public Engineer(String name,String dept, int age, int salary){
        this.name = name;
        this.age = age;
        this.dept= dept;
        this.salary= salary;
    }
    public static void main(String [] args){
        Engineer obj1 = new Engineer("Er harjeet","computer science",25,35200);
        System.out.println(" Engineer name is: "+obj1.name +", "+" Engineer age is: "+obj1.age+", "+" Engineer dept of: "+ obj1.dept+", "+" Engineer salary is: "+obj1.salary);
        Engineer obj2 = new  Engineer("Er aman", "mechanical ", 28,355522);
        System.out.println(" Engineer name is: "+obj2.name +", "+" Engineer age is: "+obj2.age+", "+" Engineer dept of: "+ obj2.dept+", "+" Engineer salary is: "+obj2.salary);

    }
}
