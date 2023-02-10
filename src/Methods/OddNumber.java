package Methods;

public class OddNumber {
    int i;
    void Odd_Number(){
        for(i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println("Number is Odd Number "+i);
            }
        }
    }

    public static void main(String[] args) {
        OddNumber object = new OddNumber();
        object.Odd_Number();
    }
}
