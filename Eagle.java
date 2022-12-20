public class Eagle extends Animal implements Flyable, Runable, Speakable{

    public Eagle(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String Speak() {
        return "Iiiii";
    }

    @Override
    public int runSpeed() {
        return 3;
    }

    @Override
    public int flySpeed() {
        return 90;
    }
    
    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
