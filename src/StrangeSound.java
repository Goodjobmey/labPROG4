public class StrangeSound {
    private String name;

    public StrangeSound(String name){this.name = name;}

    public String sounding(Street street){
        System.out.println("Но тут с " + street.getName() + " послышался странный звук: " + Sound.myy);
        return null;
    }
}
