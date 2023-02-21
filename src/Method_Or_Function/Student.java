package Method_Or_Function;

public class Student {
    //Student : study/eat/play
    /*todo Member function or Method--capabilities
    SYNTAX:access_specifier return_type method_name(Parameter) {CODE..}
    access_specifier->     public,private,protected, THEORY PART
    return_type->output of function or method:void:no return type
    method_name->can be anything:it should be meaningful &it will start with small letter
    parameter->input parameter:optional*/




    //SYNTAX : access_specifier return_type method_name(Parameter) {CODE}
    public void studyMethod(){
        System.out.println("This is studyMethod of Student class");
    }
    public void eatMethod(){
        System.out.println("This is eatMethod of Student class");
    }
    private void playMethod(){
        System.out.println("This is playMethod");
    }

}
