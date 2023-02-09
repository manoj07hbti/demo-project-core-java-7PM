package class_and_object;

import javax.xml.namespace.QName;

public class College {

    String collegename= "N.c.r.inter.collge";
    String city="tundla";
    int collegecode=10;
    int students=1000;


    public static void main(String[] args) {

        College obj1=new College();
        System.out.println("College name "+obj1.collegename);

        College obj2=new College();
        System.out.println("city "+obj1.city);

        College obj3=new College();
        System.out.println("Collegecode "+obj1.collegecode);

        College obj4=new College();
        System.out.println("students "+obj1.students);


    }




}
