package Tests;

public class OddNumberInArray {
    public static void main(String[] args) {
        int arr[]=new int[100];
        for(int i=0;i<100;i++)
            arr[i]=i+1;
        for(int j:arr){
            if(j%2!=0)
                System.out.print(j+" ");
        }
    }
}
