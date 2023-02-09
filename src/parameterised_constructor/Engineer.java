package parameterised_constructor;

public class Engineer {

    //Properties of Engineer//

    String name;
    int age;
    String department;

    //Parameterised Constructor//

    public Engineer(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {

        //Storing data of different type of Engineer by the use of parameterised constructor//

        //SYNTAX: ClassName objName = new Classname(parameter1+parameter2+parameter3); //

        Engineer Engineer1 = new Engineer("Mukul Pandey", 29, "Btech.CS");
        System.out.println("Engineer name :" + Engineer1.name + "  Age :" + Engineer1.age + "  Department :" + Engineer1.department);

        Engineer Engineer2 = new Engineer("Vikas Sharma", 33, "Mechanical");
        System.out.println("Engineer name :" + Engineer2.name + "  Age :" + Engineer2.age + "  Department :" + Engineer2.department);

        Engineer Engineer3 = new Engineer("Vishal Thkur", 45, "Chemical");
        System.out.println("Engineer name :" + Engineer3.name + "  Age :" + Engineer3.age + "  Department :" + Engineer3.department);

    }

}
