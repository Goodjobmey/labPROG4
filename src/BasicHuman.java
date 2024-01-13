public class BasicHuman extends Human implements Laughing{
    private int funnylvl;
    public BasicHuman(String name, String age){
        super(name, age);
    }

    public String looking() {
        System.out.print("И тут он увидел, как ");
        return null;
    }
    @Override
    public int laughing() {
        switch (MagicHuman.countFunnyLvl()){
            case 1: System.out.println(Sound.xexexe); break;
            case 2: System.out.println(Sound.xuxuxu); break;
            case 3: System.out.println(Sound.XAXAXA); break;
        }
        return 0;
    }


    public String thinking(String thought){
        System.out.println("И тогда " + getName() + " подумала: " + thought);
        return null;
    }
    public String startingEmotion(){
        System.out.println("Она резко изменилась в лице, ясно было, что сейчас её переполняла " + emotion.getName());
        return null;
    }
    public String wantedDrink(Food food){
        System.out.println("А ведь она просто хотела попить " + food.getName());
        return null;
    }
    public String turnaround(){ System.out.print(getName()+ " стремительно обернулась и обнаружила, что "); return null;}

    @Override
    public String toString() {
        return "BasicHuman";
    }}