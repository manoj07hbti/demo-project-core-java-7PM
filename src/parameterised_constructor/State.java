package parameterised_constructor;

public class State {

    //Properties of State//

    String name;
    int population;
    String language;

    //Parameterised Constructor//

    public State(String name, int population, String language) {
        this.name = name;
        this.population = population;
        this.language = language;
    }

    public static void main(String[] args) {

        //Storing data of different states by the use of Parameterised Constructor//

        //SYNTAX : ClassName objName=new Classname(parameter1+parameter2+parameter3); //

        State obj1 = new State("Uttar Pradesh", 777855, "Hindi");
        System.out.println("State name :" + obj1.name + "  Population :" + obj1.population + "  Language :" + obj1.language);

        State obj2 = new State("Punjab", 667878, "Punjabi");
        System.out.println("State name :" + obj2.name + "  Population :" + obj2.population + "  Language :" + obj2.language);

        State obj3 = new State("Goa", 58858, "Konkani");
        System.out.println("State name :" + obj3.name + "  Population :" + obj3.population + "  Language :" + obj3.language);
    }

}
