package ErrorMethod;

public class ErrorAge {
    public static void main(String[] args){

        int ages[]= {25,66,38,44,24,25,15,18,19,14,65};

        System.out.println("print all people ages by use for loop :");
        //use for loop

        for (int i=1; i< ages.length; i++){
            System.out.println(ages[i]);
        }
        // use while loop
        System.out.println("print all people ages by use while loop :");
        int i=0;
        while (i< ages.length){
            System.out.println(ages[i]);
            i++;
        }
        //use advance for loop
        System.out.println("print all people ages by use Advance for loop :");
        for (int var : ages){
            System.out.println(var);
        }

    }
}
