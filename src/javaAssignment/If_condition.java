package javaAssignment;
public class If_condition {
    public static void main(String[] args){

        //SYNTEX: we should be use if condition
        // it(expression of condition){
        // demo
        // }

        // mark 33: student cleared exam with passing mark

        int mark;
        mark= 33;
        if(mark>32){
            System.out.println("Student cleared exam with passing mark");
        }

        //2 mark 55: student cleared exam with second division mark

        if(mark<56){
            System.out.println("Student cleared exam with second division");
        }

        // 3. mark above to 60 the student cleared exam with first division

        if(mark<60){

            System.out.println("student pass with first division");
        }
        // 1. Age less than 18 person is child

        int age;
        age= 18;

        if(age<18){

            System.out.println("person is child");
        }
        // 2. Age less than 45 person is young
        // age= 46
        if(age<45){

            System.out.println("person is young");
        }
        //3. Age more than 60 person is old
        // age = 65
        if(age>60){

            System.out.println("person is old");
        }


    }


}
