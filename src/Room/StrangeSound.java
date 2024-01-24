package Room;

import Sound.Sound;

public class StrangeSound {
    private String name;
    Street street;

    public StrangeSound(String name){this.name = name;
    this.street = new Street("на улице");}

    public void sounding(Street street){
        System.out.println("Но тут с " + street.getName() + " послышался странный звук: " + Sound.myy);
    }
}
