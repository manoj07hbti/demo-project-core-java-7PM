package method_or_function.method_or_function;

public class Student {
    // study,eat ,play

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

     protected void studyMethod(){

         System.out.println("this is study Method of Student class");
     }
     protected void eatMethod(){

         System.out.println("this is eat Method of Student class");
     }
    protected void playaMethod(){

         System.out.println("this is play Method of Student class  ");
    }
       public static void main(String args[]){

       //  classname objectName = new className ();

           Student obj= new Student();

           // objName MethodName();

               obj.studyMethod();
               obj.eatMethod();
               obj.playaMethod();







       }






}
