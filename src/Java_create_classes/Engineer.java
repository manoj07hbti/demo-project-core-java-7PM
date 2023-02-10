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
        Engineer obj1 = new Engineer("harjeet","computer science",25,35200);
        System.out.println("obj name is: "+obj1.name +" "+"obj age is: "+obj1.age+" "+"obj dept of "+ obj1.dept+" "+"obj salary is: "+obj1.salary);
        Engineer obj2 = new  Engineer("aman", "mechanical ", 28,355522);
        System.out.println("obj name is: "+obj2.name +" "+"obj age is: "+obj2.age+" "+"obj dept of "+ obj2.dept+" "+"obj salary is: "+obj2.salary);

    }
}
