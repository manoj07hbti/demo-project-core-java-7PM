package Method_or_Function;

public class Student {
    public void study(){

        System.out.println("This is study method in student class");
    }
    public void eat(){

        System.out.println("This is eat method in student class");
    }
    public void play(){

        System.out.println("This is play method in student class");
    }

    public static void main(String[] args) {
        // syntax classname objname  = new classname();
        // making object
        Student obj= new Student();
        // calling object method
        obj.study();
        obj.play();
    }

}
