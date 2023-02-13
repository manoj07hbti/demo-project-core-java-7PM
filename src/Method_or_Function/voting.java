package Method_or_Function;

public class voting {
    public void voting(){
        int age= 28;
        String city= "Agra";
        if (age>=18 && city== "Agra"){
            System.out.println("person is eligible for voting in agra");
        }
        else {
            System.out.println("person is not eligible for voting in agra");
        }
    }

    public static void main(String[] args) {
        voting obj = new voting();
        obj.voting();
    }
}
