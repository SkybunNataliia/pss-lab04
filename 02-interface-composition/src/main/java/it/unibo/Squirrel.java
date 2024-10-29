package it.unibo;

public class Squirrel implements Animal {
    private static final double WEIGHT = 0.45;

    private Herbivore diet;
    private final double averageWeight;


    public Squirrel() {
        this.diet = new Herbivore();
        this.averageWeight = WEIGHT;
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