package it.unibo;

public class KoratCat implements Animal {
    // Default value of average weight
    private static final double WEIGHT = 3;

    private Diet diet;
    private final double averageWeight;

    //Constructor with default values
    public KoratCat() {
        this.diet = new Carnivore();
        this.averageWeight = WEIGHT;
    }

    // Constructor with value of average weight
    public KoratCat(final double weight) {
        this.diet = new Carnivore();
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
