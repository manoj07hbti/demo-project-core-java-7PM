package demo;

    public class Pet {
        String Pettype="Dog";
        String Petname="Sunny";
        String Petbreed="Pomerian";
        String Petcolour="White";
        int age= 5;

        public static void main(String[] args) {
            Pet obj1 =new Pet();
            System.out.println("Printing Pettype "+obj1.Pettype);
            System.out.println("printing Petname "+obj1.Petname);
            System.out.println("Printing Petbreed "+obj1.Petbreed);
            System.out.println("Printing Petcolour "+obj1.Petcolour);
            System.out.println("Printing age "+obj1.age);
        }
    }

