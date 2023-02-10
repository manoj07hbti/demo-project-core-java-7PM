package LoopAssignment;

public class For_loop_statement {

    public static void main(String[] args){
        //SYNTEX: (initialization, condition, increment/decrement)
        // table of 5 and use of for loop statement with increment

        int number=5;
        for(int i=1; i<=10; i++){

            System.out.println(number+"x"+i+"="+number*i);
        }
// Factor of 7 and Use of decrement method
        int fact=1;

        for(int i=7; i>0; i--){

            System.out.println(+i*fact);
        }
    }
}
