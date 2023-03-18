package collection.list;

import model.Student;

import java.util.ArrayList;

public class LastElement {

    public ArrayList<Student> find(){
        ArrayList<Student> data= new ArrayList<>();

        Student st1= new Student("Praveen",1,"Java","AgraCollege");
        Student st2= new Student("Chudri",2, "Java","AgraCollege");
        Student st3= new Student("Anurag", 3,"DBA","S R K College");

        data.add(st1);
        data.add(st2);
        data.add(st3);


        //System.out.println("Printing last Element of ArrayList : "+data.get(data.size()-1));
        return data;
    }

    public static void main(String[] args) {
        LastElement obj= new LastElement();
        ArrayList<Student> var1= obj.find();
        System.out.println("Printing last Element of ArrayList : \n"+"Name : "+var1.get(var1.size()-1).getName()+" Roll Number : "+var1.get(var1.size()-1).getRoll_no()+" Course : "+var1.get(var1.size()-1).getCourse());
        //System.out.println("");

    }
}
