public class Turtule extends Animal implements Runable, Swimable, Speakable {

    public Turtule(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public int swimSpeed() {
        return 65;
    }

    @Override
    public int runSpeed() {
        return 9;
    }

    @Override
    public String Speak() {
        return "Shhh";
    }

    @Override
    public String toString() {
        return "Turtule" + super.toString();
    }
    
}
