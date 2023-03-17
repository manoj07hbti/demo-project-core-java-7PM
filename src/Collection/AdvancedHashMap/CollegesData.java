package Collection.AdvancedHashMap;

import Model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CollegesData {

    public HashMap<Integer, ArrayList<Student>> collegedata(){
        boolean flag=false;

        HashMap<Integer, ArrayList<Student>> collegelist= new HashMap<>();

        ArrayList<Student> colleges= new ArrayList<>();

        Student st1= new Student("Praveen",1,"Java","Agra College");
        Student st2= new Student("Chudri",2, "Java","Agra College");

        //ArrayList<Student> SRKCollege= new ArrayList<>();

        Student st3= new Student("Anurag", 3,"DBA","S R K College");
        Student st4= new Student("Ankit",4, "React","S R K College");

        colleges.add(st1);
        colleges.add(st2);
        colleges.add(st3);
        colleges.add(st4);

        collegelist.put(1, colleges);
        //collegelist.put("S R K College",SRKCollege);

        for (Integer var : collegelist.keySet()){
            for(int i=0;i<colleges.size();i++){
                if(colleges.get(i).getCollege_name().equals("S R K College")){
                    System.out.println("Student Name : "+colleges.get(i).getName());
                    flag=true;
                }

            }
            if (flag==false){
                System.out.println("Not Found");
            }
        }

        return collegelist;
    }

    public static void main(String[] args) {
        CollegesData obj= new CollegesData();
        obj.collegedata();
    }
}
