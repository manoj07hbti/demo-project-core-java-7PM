package Forloopandwhileloop;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class Oddnumber {
    public static void main(String[] args) {
        int Number=100;
        System.out.println("odd number 1 to " +Number+"  are:");
        for (int i=1; i<=Number; i++){
            if(i % 2!=0){
                System.out.println(i + "");
            }
        }
    }
}
