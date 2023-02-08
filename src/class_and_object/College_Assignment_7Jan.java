package class_and_object;

public class College_Assignment_7Jan {

    String CollegeName="IIT";
    String CollegeCity="Bombay";
    int Branch=5;
    double AnnualFees=90000.00;

    public static void main(String[] args) {
        //className objName= new className();
        College_Assignment_7Jan Obj1=new College_Assignment_7Jan();
        System.out.println("Print the College Details with Name " +Obj1.CollegeName);
        System.out.println("Print the College City" +Obj1.CollegeCity);
        System.out.println("Print the Total Branch " + Obj1.Branch);
        System.out.println("Print the Annual Fees Of College " +Obj1.AnnualFees);


    }

}
