package exception_handling;

public class ArrayException {

    int array[]= {12,34,76,87,98};
    public void m1(){
        for (int i=0;i<6;i++){
            try {
                System.out.println(array[i]);
            }
            catch (Exception e){
                System.out.println("Exception Occurred : "+e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayException obj= new ArrayException();
        obj.m1();
    }
}
