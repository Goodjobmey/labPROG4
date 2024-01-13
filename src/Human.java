import java.util.Objects;
import java.util.Random;

public class Human{
    private String name;
    private String age;
    BodyPart bodyPart;
    Emotion emotion;
    int lvl;

    public Human(String name, String age){
        this.age=age;
        this.name=name;
        this.bodyPart = new BodyPart("ручка","маленькая пухленькая");
        this.emotion = new Emotion("злость");
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}

    public BodyPart getBodyPart() {return bodyPart;}



    @Override
    public String toString(){
        return "Human";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Human human)) return false;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age) && Objects.equals(bodyPart, human.bodyPart) && Objects.equals(emotion, human.emotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, bodyPart, emotion);
    }
}
