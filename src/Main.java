import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BasicHuman frakenbok = new BasicHuman("Фрекен Бок ", "женщина ");
        BasicHuman malysh = new BasicHuman("Малыш", "ребенок");
        MagicHuman karlson = new MagicHuman("Карлсон", "мужчина в самом расцвете сил");

        Food plushka = new Food("плюшку");
        Food plushki = new Food("плюшки");
        Food kofe = new Food("кофе");

        StrangeSound my = new StrangeSound("мычание");
        Street street = new Street("улицы");



        malysh.looking();
        karlson.stolingFood(plushka);
        //karlson.countFunnyLvl();
        malysh.laughing();

        frakenbok.thinking("'он самый утомительный в мире мальчик'");
        frakenbok.wantedDrink(kofe);
        frakenbok.startingEmotion();
        my.sounding(street);
        frakenbok.turnaround();
        plushki.gettingLost();
    }
}