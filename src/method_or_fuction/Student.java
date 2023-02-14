package method_or_fuction;

public class Student {



    //       Syntax : access_specifier return_type  method_name (parameter) {CODE..} //

    public void Study(){

        System.out.println("This Is Study Method In Student Class");
    }

    private void Eat(){
        System.out.println("This Is Eat Method In Student Class");

    }

     protected void Play(){

        System.out.println("This Is Play Method In Student Class");
    }

    public static void main(String[]args){

        Student obj = new Student();

        obj.Eat();

        obj.Play();

        obj.Study();



    }

}






