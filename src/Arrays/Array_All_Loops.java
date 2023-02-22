package Arrays;

public class Array_All_Loops {

    public static void main(String args[]){

        // SYNTAX Datatype varName []= {value 1,value 2,value 3,.......};

          String Brands []={"Vivo","Nokia","Sumsung","Lava","Lenovo","Oppo","Intex"};

          System.out.println("Printing All mobile Brand for Loop");

          for(int i=0;i<Brands.length;i++) {

              System.out.println(Brands[i]);
          }
        int i=0;

         System.out.println("Printing All mobile Brand for while Loop");

         while(i<Brands.length) {

             System.out.println(Brands[i]);
             i++;
         }
         System.out.println("Printing All mobile Brand for Advance Loop");

          for(String var: Brands){

              System.out.println(var);
          }
          int age []={  21,34,43,33,41,54,};

          System.out.println("Printing age for Loop");

          for(int k=0;k<age.length;k++){

              System.out.println(age[k]);
          }
        int k=0;

          System.out.println("Printing age for while loop");

          while(k<age.length){

              System.out.println(age[k]);
              k++;
          }
         System.out.println("Printing age for Advance Loop");

          for(int var : age){

              System.out.println(var);
          }





          }







    }














