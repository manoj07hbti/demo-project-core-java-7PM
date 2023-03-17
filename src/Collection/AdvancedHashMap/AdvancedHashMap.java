package Collection.AdvancedHashMap;

import Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdvancedHashMap {

    public HashMap<Integer, ArrayList<Student>> create(){

        HashMap<Integer, ArrayList<Student>> studentlist= new HashMap<>();

        ArrayList<Student> studentArraylist= new ArrayList<>();

        Student st1= new Student("Praveen",1,"Java","AgraCollege");
        Student st2= new Student("Ajeet", 2, "Python","AgraCollege");
        Student st3= new Student("Anurag", 3, "DBA","S R K College Name");
        //Student st4= new Student("Ankit",3,"React");

        studentArraylist.add(st1);
        studentArraylist.add(st2);
        studentArraylist.add(st3);
        //studentArraylist.add(st4);

        studentlist.put(1,studentArraylist);


        for (Integer var : studentlist.keySet()){
            //  System.out.println("Name : "+studentArraylist.get(var).getName()+" Roll Number : "+studentArraylist.get(var).getRoll_no()+" Course : "+studentArraylist.get(var).getCourse());
            for(int i=0; i<studentArraylist.size();i++){
                System.out.println("Name : "+studentArraylist.get(i).getName()+" Roll Number : "+studentArraylist.get(i).getRoll_no()+" Course : "+studentArraylist.get(i).getCourse()+" College Name : "+studentArraylist.get(i).getCollege_name());
            }
        }
//        for(Map.Entry m : studentlist.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        return studentlist;
    }

    public static void main(String[] args) {
        AdvancedHashMap obj= new AdvancedHashMap();
        obj.create();
    }
}
