package Testfirst;

public class UseALoopAddNum {
    // Q write a program to print array using advanced loop with odd number from 1 to 10
    public static void main(String[] args){
        int num[]={1,2,3,4,5,6,7,8,9,10};

        for(int var : num){
            if(num[var]%2 !=0){
                System.out.println(num[var]);
            }
        }
    }
}
