package Humanity;

import Interface.Compose;
import Interface.Laughing;
import Room.ChanelDontExist;
import Room.TV;
import Sound.Sound;

public class BasicHuman extends Human implements Laughing {
    private int funnylvl;

    
    public BasicHuman(String name, String age, String gender){
        super(name, age, gender);
    }


    public void looking() {
        System.out.print("И тут он увидел, как ");
    }
    @Override
    public void laughing() {
        switch (MagicHuman.countFunnyLvl()) {
            case 1 -> System.out.println(Sound.xexexe);
            case 2 -> System.out.println(Sound.xuxuxu);
            case 3 -> System.out.println(Sound.XAXAXA);
        }
    }

    public void thinking(String thought){
        System.out.println("И тогда " + getName() + " подумала: " + thought);
    }
    public void wantedDrink(Food food){
        System.out.println("А ведь она просто хотела попить " + food.getName());
    }
    public void turnaround(){ System.out.print(getName()+ " стремительно обернулась и обнаружила, что ");}

    public void singing(){
        System.out.println("И тут " + getName() + " запел: ");
        compose.composePoem();
    }

    Compose compose = () -> {
        System.out.println("Божья коровка,\n" +
                "Полети на небо,\n" +
                "Принеся нам хлеба.\n" +
                "Сушек, плюшек,\n" +
                "Сладеньких ватрушек.");
        return null;
    };


    public void humanSwithOnTV(){
        try{
            TV.swithOnTV();
        } catch (ChanelDontExist c){
            System.out.println(c.getMessage());
        } finally {
            System.out.println("Вконце концов, телевизор выключили");
        }
    }

    @Override
    public String toString() {
        return "Humanity.BasicHuman";
    }}