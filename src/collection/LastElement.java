package collection;

import Model.student;

import java.util.ArrayList;

public class LastElement {

    public static void main(String args[]){

        LastElement obj = new LastElement();

         ArrayList<student> var = obj.find();

         System.out.println("Printing last element of ArrayList :"+var.get(var.size()-1).getName()+ " roll no :"+var.get(var.size()-1).getRollNo()+ " city :"+var.get(var.size()-1).getCity()+ " section :"+var.get(var.size()-1).getSection());

      // find the second Element

        System.out.println("printing Second Element :"+var.get(1).getName()+ " roll no :"+var.get(1).getRollNo()+ " city :"+var.get(1).getCity()+ " section :"+var.get(1).getSection() );

        // we need to find out IT section Student


            }

    public ArrayList<student> find(){

        ArrayList<student> data = new ArrayList<>();

        // create data of Student

        student st1 = new student("Anchal",1,"Agra","IT");
        student st2 = new student("Sapna",2,"Pune","CS");
        student st3 = new student("Tanvi",3,"Dubai","IT");
        student st4 = new student("Rahul",4,"Kolkata","CS");

            data.add(st1);
            data.add(st2);
            data.add(st3);
            data.add(st4);

            return data;
    }
            }





    }







}



