package it.unibo;

public class KoratCat implements Animal {
    private static final double WEIGHT = 3;

    private Carnivore diet;
    private final double averageWeight;


    public KoratCat() {
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
