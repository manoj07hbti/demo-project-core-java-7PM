package Java_create_classes;

public class State {
    String name;
    int population;
    int total_district;
    // this is a state file
    public State (String name, int population, int total_district){
        this.name = name;
        this.population= population;
        this.total_district =total_district;
    }
    public static void main(String [] args){
        State obj1 = new State("uttar pradech",220000000,75);
        System.out.println("State name is: "+obj1.name +", "+"population is: "+obj1.population+", "+"total_district is: "+obj1.total_district);
        State obj2 = new State("delhi", 9000000, 7);
        System.out.println("State name is: "+obj2.name +", "+" population is: "+obj2.population+", "+" total_district is: "+obj2.total_district);

    }
}
