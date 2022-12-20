import java.util.ArrayList;
import java.util.List;

public class Home {

    public List<Animal> getAnimals() {
        return homeAnimals;
    }


    private List<Animal> homeAnimals = new ArrayList<>();

    public Home addAnimal(Animal a){
        homeAnimals.add(a);
        return this;
    }

    @Override
    public String toString() {
        return String.format("Zoo {%s}", homeAnimals);
    }

    public String talk() {
        StringBuilder sb = new StringBuilder();
        for (Speakable animal : getSpeakable()) {
            sb.append(animal.Speak() + "\n");
        }
        return sb.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : homeAnimals) {
            if(animal instanceof Speakable) {
                result.add((Speakable)animal);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal an : homeAnimals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }
        }
        return result;
    }

    public int getChampionSpeed() {
        int max = 0;
        for (Runable animal : getRunable()) {
            if(animal.runSpeed() > max) {
                max = animal.runSpeed();
            }
        }
        return max;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : homeAnimals) {
            if(animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result; 
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : homeAnimals) {
            if(animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }



}
