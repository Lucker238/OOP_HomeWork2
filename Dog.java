public class Dog extends Animal implements Speakable, Runable{

    public Dog(String name, int legs, String owner) {
        super(name, legs, owner); 
    }

    @Override
    public String Speak() {
        return "Wow";
    }

    @Override
    public int runSpeed() {
        return 35;
    }
    
    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
