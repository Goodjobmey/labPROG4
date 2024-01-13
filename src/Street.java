public class Street {
    private String location;
    private String weather;

    public Street(String location){ this.location=location; }

    public String getName() {return location;}
    public String setName(String location) {this.location = location; return location; }

}
