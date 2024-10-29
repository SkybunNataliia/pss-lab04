package it.unibo;

public class SiameseCat implements Animal {
    private static final double WEIGHT = 29.88;
    private static final boolean VEGETABLES = true;

    private final double averageWeight;
    private final boolean eatVegetables;


    public SiameseCat() {
        this.averageWeight = WEIGHT;
        this.eatVegetables = VEGETABLES;
    }

    public double averageWeight() {
        return averageWeight;
    }

    public boolean canEatVegetables() {
        return eatVegetables;
    }

    public boolean canEat(Animal a) {
        if (a.averageWeight() < this.averageWeight) {
            return true;
        }
        else {
            return false;
        }
    }
}
