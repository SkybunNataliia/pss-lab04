package it.unibo;

public class SiameseCat implements Animal {
    private static final double WEIGHT = 4.5;

    private Diet diet;
    private final double averageWeight;


    public SiameseCat() {
        this.diet = new Carnivore();
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
