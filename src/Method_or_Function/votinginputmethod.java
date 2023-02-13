package Method_or_Function;

public class votinginputmethod {
    public void voting(int age, String city){
        if (age>=18 && city== "Agra"){
            System.out.println("person is eligible for voting in agra");
        }
        else {
            System.out.println("person is not eligible for voting in agra");
        }
    }

    public static void main(String[] args) {
        votinginputmethod obj = new votinginputmethod();
        obj.voting(28,"Agra");
        obj.voting(28,"Delhi");
    }
}

