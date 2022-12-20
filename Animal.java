/**
 * Animal
 */
public abstract class Animal {
    
    public Animal(String name, int legs, String owner) {
        this.name = name;
        this.legs = legs;
        this.owner = owner;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("(Name: %s, Legs: %d, Owner: %s)", name, legs, owner);
    }



}