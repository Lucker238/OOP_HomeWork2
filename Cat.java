public class Cat extends Animal implements Speakable, Runable{

    public Cat(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String Speak() {
        return "Meow";
    }

    @Override
    public int runSpeed() {
        return 30;
    }
    
    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

}
