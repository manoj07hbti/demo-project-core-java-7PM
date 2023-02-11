package Method_obje;

public class Student {
    // SYNTEX: Student : study/ eat / play

    public void study(){
        System.out.println("student should be always study");

    }
    private void eat(){
        System.out.println("student eat tha fast food");

    }
    public void play(){
        System.out.println("Student should be play in a hour per day");
    }

    public static void main(String [] args){

        Student obj= new Student();

        obj.study();
        obj.eat();
        obj.play();
    }

}
