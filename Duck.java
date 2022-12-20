public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable{

    public Duck(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public int runSpeed() {
        return 8;
    }

    @Override
    public String Speak() {
        return "Ga ga ga";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 15;
    }
}
