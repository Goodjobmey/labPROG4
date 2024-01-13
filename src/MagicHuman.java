import java.util.Random;

public class MagicHuman extends Human implements Stoling{

    public MagicHuman(String name, String age){
        super(name, age);
    }

    public int stolingFood(Food food) {
        System.out.println(bodyPart.getCharacteristic() + " " + bodyPart.getName() + " стащила с блюдца ещё одну " + food.getName());
        return 0;
    }

    public static int countFunnyLvl(){
        Random random = new Random();
        int lvl = random.nextInt(3)+1;
        return lvl;
    }


}