public class Main {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.addAnimal(new Cat("Chernish", 4, "Oleg"));
        home1.addAnimal(new Dog("Cooper", 4, "Yana"));
        home1.addAnimal(new Dog("Bonifazi", 4, "Maksim"));
        home1.addAnimal(new Duck("Gogoosha", 2, "Grigoriy"));
        home1.addAnimal(new Eagle("Orlusha", 2, "Peacemaker"));
        home1.addAnimal(new Turtule("Cherepavel", 4, "Maksim"));
        
        System.out.println(home1);
        System.out.println(home1.talk());
        for (Runable runs : home1.getRunable()) {
            System.out.println(runs.runSpeed());           
        }
        System.out.println();
        System.out.println(home1.getChampionSpeed());
        System.out.println();
        for (Flyable fly : home1.getFlyable()) {
            System.out.println(fly.flySpeed());
        }
        for(Swimable swim : home1.getSwimable()) {
            System.out.println(swim.swimSpeed());
        }

        SaveManagerAnimals sma = new SaveManagerAnimals();
        sma.save(home1.getAnimals());



    }   

}
