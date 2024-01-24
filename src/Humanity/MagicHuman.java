package Humanity;

import java.util.Random;

public class MagicHuman extends Human {
    private Food food;

    public MagicHuman(String name, String age, String gender){
        super(name, age, gender);
        this.food = new Food("плюшки");
    }
    public void stolingFood(Human.BodyPart bodyPart) {
        System.out.println(bodyPart.getCharacteristic() + " "+ bodyPart.getName() + " стащила с блюдца ещё одну " + food.getName());
    }
    public static int countFunnyLvl(){
        Random random = new Random();
        int lvl = random.nextInt(3)+1;
        return lvl;
    }
}