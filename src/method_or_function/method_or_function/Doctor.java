package method_or_function.method_or_function;

public class Doctor {

    // visit,checkup.surgery

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void visitMethod(){

        System.out.println("this is visit Method  of Doctor class");
    }
     public void checkupMathod(){

        System.out.println("this is checkup Method of Doctor class");
     }
      private void surgeryMethod(){

        System.out.println("this is surgery Metthod of Doctor class");
      }

     public static void main(String args[]){

        // SYNTAX className objectName = new className();

              Doctor obje = new Doctor();

         // objName.MethodName();

             obje.visitMethod();

             obje.checkupMathod();

             obje.surgeryMethod();






     }






}
