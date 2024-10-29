package it.unibo;

/**
 * The SiameseCat class implements the Animal interface,
 * describes the basic characteristics of an SiameseCat.
 */
public class SiameseCat implements Animal {
    // Default value of average weight
    private static final double WEIGHT = 4.5;

    private Diet diet;
    private final double averageWeight;

    //Constructor with default values
    public SiameseCat() {
        this.diet = new Carnivore();
        this.averageWeight = WEIGHT;
    }

    // Constructor with value of average weight
    public SiameseCat(double weight) {
        this.diet = new Carnivore();
        this.averageWeight = weight;
    }

    public double averageWeight() {
        return averageWeight;
    }

    public boolean canEatVegetables() {
        return diet.getEatVegetables();
    }

    public boolean canEat(Animal a) {
        return diet.getEatMeat() && (a.averageWeight() < this.averageWeight);
    }
}
