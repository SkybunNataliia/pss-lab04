package it.unibo;

/**
 * The Squirrel class implements the Animal interface,
 * describes the basic characteristics of an Squirrel.
 */
public class Squirrel implements Animal {
    // Default value of average weight
    private static final double WEIGHT = 0.45;

    private Diet diet;
    private final double averageWeight;

    //Constructor with default values
    public Squirrel() {
        this.diet = new Herbivore();
        this.averageWeight = WEIGHT;
    }

    // Constructor with value of average weight
    public Squirrel(final double weight) {
        this.diet = new Herbivore();
        this.averageWeight = weight;
    }

    public double averageWeight() {
        return averageWeight;
    }

    public boolean canEatVegetables() {
        return diet.getEatVegetables();
    }

    public boolean canEat(final Animal a) {
        return diet.getEatMeat() && (a.averageWeight() < this.averageWeight);
    }
}
