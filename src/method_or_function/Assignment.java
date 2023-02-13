package method_or_function;

import javax.print.attribute.standard.PageRanges;

public class Assignment {

    public void cube() {

        int number=5;
        int i=number*number;

        System.out.println("cube of 5 is : " +i);
    }

    public void oddnumber(){

        int number=100, i=1;
        while (i<=number){
        if (i%2!=0){
            System.out.println("Odd number is :  " +i);
        }
        i++;}
    }
    public void votingmethod() {
        int age = 18;
        String city = "Agra";
        if (age < 19 & city == "Agra") {
            System.out.println("person is eligble for voting in agra");
        }
        else {
            System.out.println("person is not eligible for voting in agra");
        }

    }
    public void subtractmethod() {

        int a=50;
        int b=10;
        int sub=a-b;
        System.out.println("subtract is : " +sub);
    }
    public void multiply() {

        int a=6;
        int b=4;
        int multi=a*b;

        System.out.println("Result is : " +multi);
    }

    public static void main(String[] args) {


        Assignment obj = new Assignment();
        obj.cube();
        obj.oddnumber();
        obj.votingmethod();
        obj.subtractmethod();
        obj.multiply();
    }
        {



        }
        }


