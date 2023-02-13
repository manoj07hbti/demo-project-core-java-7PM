package demo;

public class Oddnumber_Methodcalling {
    public void oddNumbers(){
        int ans;
        for (int i = 0; i <=100; i++) {
            ans=i%2;
            if (ans !=0){
                System.out.println(i+" is a odd number");
            }
        }
    }
    public static void main(String[] args) {
        Oddnumber_Methodcalling obj= new Oddnumber_Methodcalling();
        obj.oddNumbers();
    }
}

