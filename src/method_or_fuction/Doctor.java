package method_or_fuction;

public class Doctor {

    //       Syntax : access_specifier return_type  method_name (parameter) {CODE..} //

    public static void Visit(){
        System.out.println("This IS Visit Method In Doctor Class");

    }

    private void Checkup(){
        System.out.println("This Is Checkup Method In Doctor Class");

    }

    protected void Surgery(){
        System.out.println("This Is Surgery Method In Doctor Class");
    }

    public static void main(String[]args){

        Doctor obj=new Doctor();

        obj.Visit();

        obj.Checkup();

        obj.Surgery();


    }




}
