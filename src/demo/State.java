package demo;

public class State {
    String State="Maharashtra";
    int cities=15;
    String Language="Marathi";
    String Festival="Gudi padwa";
    String food="Vada pav";

    public static void main(String[] args) {
        State obj1 = new State();
        System.out.println("Printing State name "+ obj1.State);
        System.out.println("Printing state cities "+ obj1. cities);
        System.out.println("Printing state Language "+ obj1. Language);
        System.out.println("printing State festival "+ obj1. Festival);
        System.out.println("Printing State food "+ obj1. food);
    }
}
