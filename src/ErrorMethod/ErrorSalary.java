package ErrorMethod;

public class ErrorSalary {
    public static void main(String[] args){

       double salary[]={2523.25,14525.58,25222,1000,25698.25,100020,};

        for (int i=1; i< salary.length; i++){
            System.out.println("print all people salary by use for loop :"+salary[i]);
        }
        int i=0;
        while (i< salary.length){
            System.out.println("print all people salary by use while loop :"+salary[i]);
            i++;
        }

        for (double var: salary){
            System.out.println("print all people salary by use advance for loop :"+var);
        }
    }
}
