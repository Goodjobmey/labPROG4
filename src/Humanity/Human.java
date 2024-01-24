package Humanity;

import Humanity.Emotion;
import Interface.Talking;

import java.util.Objects;

public abstract class Human implements Talking {
    private String name;
    private String age;
    private String gender;
    BodyPart bodyPart;
    Emotion emotion;


    public Human(String name, String age, String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.emotion = new Emotion("злость");
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public BodyPart getBodyPart() {return bodyPart;}

    @Override
    public String screaming(String thoughts) {
        if (gender.equals("W")){ System.out.println(getName() + "завопила: " + thoughts);};
        if (gender.equals("M")){ System.out.println(getName() + "завопил: " + thoughts);};
        return thoughts;
    }

    public abstract void stolingFood(BodyPart bodyPart);

    public class BodyPart {
        private String name;
        private String characteristic;

        public BodyPart(String name, String characteristic) {
            this.name = name;
            this.characteristic = characteristic;
        }

        public String getName() {
            return name;
        }

        public String setName(String name) {
            this.name = name;
            return name;
        }

        public String getCharacteristic() {
            return characteristic;
        }

        public String setCharacteristic(String characteristic) {
            this.characteristic = characteristic;
            return characteristic;
        }

    }

//    @Override
//    public String toString(){
//        return "Humanity.Human";
//    }
//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (!(object instanceof Humanity.Human human)) return false;
//        return Objects.equals(name, human.name) && Objects.equals(age, human.age) && Objects.equals(bodyPart, human.bodyPart) && Objects.equals(emotion, human.emotion);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, bodyPart, emotion);
//    }
}
