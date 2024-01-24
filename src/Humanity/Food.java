package Humanity;

public class Food {
    private String name;

    public Food(String name){this.name = name;}

    public String getName() {return name;}
    public String setName(String name) {this.name = name; return name; }


    @Override
    public String toString(){ return "Humanity.Food"; }
}
