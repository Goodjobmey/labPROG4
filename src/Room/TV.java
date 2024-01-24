package Room;

import java.util.Random;

public class TV {
    Street location;
    public TV(Street location){
        this.location=location;
    }
    public static int setChannel() {
        Random random = new Random();
        TV.Channel.channel = (int) (random.nextDouble() * 9 + 1);
        return Channel.channel;
    }

    public static void swithOnTV() throws ChanelDontExist {
        int channel = TV.setChannel();
        System.out.println("Малыш другрешил включить телевизор, в правом уголке одиноко мигал номер канала: " + channel);
        switch (channel) {
            case 1 -> System.out.println("По каналу передавали какого-то старого дядьку");
            case 2 -> System.out.println("Попался канал с миром животных");
            case 3 -> System.out.println("Ну вот, нормальный телеканал, тут показывали мультики");
            case 4 -> System.out.println("В телефизоре на весь экран покзали соника");
            case 5 -> System.out.println("По телевизору показывалу стариковстую мелодрамму");
            default -> throw new ChanelDontExist("В телевизоре появились помехи");
        }
    }
    public static class Channel{
        public static int channel;
    }
}
