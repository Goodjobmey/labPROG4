import Humanity.BasicHuman;
import Humanity.Food;
import Humanity.Human;
import Humanity.MagicHuman;
import Room.StrangeSound;
import Room.Street;

public class Main {
    public static void main(String[] args){

        BasicHuman frakenbok = new BasicHuman("Фрекен Бок ", "женщина ", "W" );
        BasicHuman malysh = new BasicHuman("Малыш", "ребенок", "M" );
        MagicHuman karlson = new MagicHuman("Карлсон", "мужчина в самом расцвете сил", "M");

        Food kofe = new Food("кофе");

        StrangeSound my = new StrangeSound("мычание");
        Street street = new Street("улицы");

        Human.BodyPart ruka = karlson.new BodyPart("ручка", "маленькая пухленькая");




        malysh.looking();
        karlson.stolingFood(ruka);
        malysh.laughing();
        frakenbok.thinking("'он самый утомительный в мире мальчик'");
        frakenbok.wantedDrink(kofe);
        my.sounding(street);
        frakenbok.turnaround();

        frakenbok.screaming("О боже, где мои плюшки?");
        malysh.singing();
        malysh.humanSwithOnTV();

    }
}