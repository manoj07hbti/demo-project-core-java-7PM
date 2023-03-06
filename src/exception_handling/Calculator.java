package exception_handling;

public class Calculator {

    public int devide(int a, int b){
        int result=0;
            try {
                result=a/b;
            }
            catch (Exception e){
                System.out.println("Expection occured : " +e);
            }
        return result;
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();

        int output= obj.devide(4,2);
        System.out.println("devide is : " +output);

    output =obj.devide(3,0);
        System.out.println("devide by 0 is : " +output);
        }
    }
