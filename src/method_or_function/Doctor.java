package method_or_function;

public class Doctor {

    // Making method of doctor class //

    // visit , checkup , surgery

    //SYNTAX : access_specifier return_type method_name (parameter)  {CODE....}
    //        access_specifier -> public , private , protected, default   THEORY PART
    //
    //        public: accessible for all
    //        private: only owner can access, accessible only within class
    //        protected: Parent---> Child
    //        default : accessible within package
    //
    //        return_type   -> output of function or method :  void : no return type
    //        Calculator----> add 2+3=5, sub 4.5-1.5=3.0 , multi , divide
    //
    //        method_name -> can be anything: it should be meaningful and it will start from                        small letter
    //
    //        parameter ->  input parameter : optional*/

    public void visit() {
        System.out.println("This is visit method of doctor class...");
    }

    public void checkup() {
        System.out.println("This is checkup method of doctor class..");
    }

    private void surgery() {
        System.out.println("This is surgery method of doctor class..");
    }

}
