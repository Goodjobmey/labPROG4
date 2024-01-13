public class BodyPart {
    private String name;
    private String characteristic;

    public BodyPart(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getName() {return name;}
    public String setName(String name) {this.name = name; return name; }
    public String getCharacteristic() {return characteristic;}
    public String setCharacteristic(String characteristic) {this.characteristic = characteristic; return characteristic; }

    @Override
    public String toString(){
        return "BodyPart";
    }
}
