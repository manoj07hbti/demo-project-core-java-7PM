package collection.hashSet;

import model.StringHashCodeDemo;

import java.util.LinkedHashSet;

public class StringHashCode {

    public LinkedHashSet<StringHashCodeDemo> stringHashSet(){

        LinkedHashSet<StringHashCodeDemo> data= new LinkedHashSet<>();

        StringHashCodeDemo emp1= new StringHashCodeDemo("Praveen","Dev","B-Tech");
        StringHashCodeDemo emp2= new StringHashCodeDemo("Ajeet","Dev","B-Tech");

        data.add(emp1);
        data.add(emp2);

        return data;
    }

    public static void main(String[] args) {
        StringHashCode obj= new StringHashCode();
        LinkedHashSet<StringHashCodeDemo> var1= obj.stringHashSet();
        for (StringHashCodeDemo var : var1){
            System.out.println("Name : "+var.getName()+" Department : "+var.getDepartment()+" Qualification : "+var.getDepartment());
        }
    }
}
