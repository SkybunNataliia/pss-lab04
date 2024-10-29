package it.unibo;

public class Kangaroo implements Animal {
    // Default value of average weight
    private static final double WEIGHT = 29.88;

    private Diet diet;
    private final double averageWeight;

    //Constructor with default values
    public Kangaroo() {
        this.diet = new Herbivore();
        this.averageWeight = WEIGHT;
    }

    // Constructor with value of average weight
    public Kangaroo(final double weight) {
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
