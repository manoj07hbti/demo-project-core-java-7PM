package array;

public class SalaryArray_Assign_20Feb {

    public static void main(String[] args) {
        double salary[]={2525.02 , 333323.22, 45645.212 , 32323.121,12546,01};

        //loop
        for(int i=0; i<salary.length;i++){
            System.out.println("Print with loop " +salary[i]);
        }
        //while loop
        int i=0;
        while(i<salary.length){
            System.out.println("print in while loop "+salary[i]);
            i++;
        }
        //advacne loop
        for(double var :salary){
            System.out.println("print with advance loop :" +var);

        }


    }
}
