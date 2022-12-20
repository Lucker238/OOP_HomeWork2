import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveManagerAnimals {
    public void save(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("List.txt", false)) {
            for (Animal animal : animals) {
                writer.write(animal.toString()+ "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
