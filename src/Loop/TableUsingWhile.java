package Loop;

public class TableUsingWhile {
    public static void main(String[] args) {
        int number=5,i=1;
        while(i<11){
            int result = number*i;
            System.out.println(number+" * "+i+" = "+result);
            i++;
        }
    }
}
