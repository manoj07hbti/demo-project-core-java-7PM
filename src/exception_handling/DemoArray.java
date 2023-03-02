package exception_handling;

public class DemoArray {

    public void demo (){

        int arr[]= {1,32,34,13,15};

        System.out.println("Printing element at index :0 "+arr[0]);

        System.out.println("Printing element at index :0 "+arr[3]);


        try {
            System.out.println("Printing element at index :0 " + arr[5]);
        }
        catch (Exception e){

            System.out.println("Exception occurred : "+e);
        }


        System.out.println("Printing element at index :0 "+arr[1]);
        System.out.println("Printing element at index :0 "+arr[2]);

    }

    public static void main(String[] args) {

        DemoArray obj= new DemoArray();

            obj.demo();

    }
}
