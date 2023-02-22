package arrays;

public class DemoArrays {

    public static void main(String[] args) {

        String Brands [] ={"Levis", "U.S POLO","Tommy","Superdry","Blackberrys","Arrow","Celio"};

        for (int i=0; i< Brands.length; i++){
        System.out.println("Printing all Brands in loop : " +Brands[i]);
    }
        int i=0;
    while (i< Brands.length){
        System.out.println("Printing all Brands in while loop : " +Brands[i]);
        i++;
    }

    for (String var : Brands){
        System.out.println("Printing all element in advance loop :" +var);
    };


    int Age [] = {23,35,41,54,67,75,82,100};
    for (int a=0;a< Age.length;a++){
        System.out.println("Printing all Age in for loop : " +Age[a]);
    }
    int a=0;
    while (a< Age.length){
        System.out.println("Printing all Age in while loop : " +Age[a]);
        a++;
    }
    for (int var : Age){
        System.out.println("Printing all Age in advance loop : " +var);
    }

    int Salary []={2500,8000,15000,25000,50000};
    for (int b=0;b< Salary.length;b++){
        System.out.println("Printing Salary in For Loop : " +Salary[b]);
    }

    int b=0;
    while (b< Salary.length){
        System.out.println("Printing Salary in While Loop : " +Salary[b]);
        b++;
    }
    for (int var  : Salary){
        System.out.println("Printing Salary in Advance Loop : " +var);
    }

    }
}
