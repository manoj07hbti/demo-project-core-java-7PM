package method_or_function;

public class Book {

    // read , write , sale

    //SYNTAX  : access_specifier return_type  method_name (parameter) {CODE..}

    public void readMethod(){

        System.out.println("This is read method of book Class");
    }

    public void writeMethod(){

        System.out.println("This is write method of Book class");
    }

    private void saleMethod(){

        System.out.println("This is sale method of Book class");
    }
// SYNTAX  : access_specifier return_type  method_name (parameter) {CODE..}
    public static void main(String[] args) {

        //STEP 1 :  ClassName objName = new ClassName();

        Book obj= new Book();

        //STEP 2 : objName.MethodName();

        obj.readMethod();// calling read method

        obj.writeMethod();// calling write method

        obj.saleMethod();// calling sale method


    }


}
