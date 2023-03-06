package exception_handling;

public class DemoArray {
    public void Demo(){

        int arr[]={1,32,34,67,68};
        System.out.println("printind element at endex : 0 " +arr[0]);

        System.out.println("printind element at endex : 0 " +arr[1]);

        System.out.println("printind element at endex : 0 " +arr[2]);
try {
    System.out.println("printind element at endex : 0 " +arr[6]);
}
catch (Exception e){

    System.out.println("Exception occured : " +e);
}
        System.out.println("printind element at endex : 0 " +arr[4]);

        System.out.println("printind element at endex : 0 " +arr[3]);


    }

    public static void main(String[] args) {
        DemoArray obj=new DemoArray();
        obj.Demo();
    }
}
