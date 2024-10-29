package it.unibo;

public class Kangaroo implements Animal {

    private static final double WEIGHT = 29.88;
    private static final boolean VEGETABLES = true;

    private final double averageWeight;
    private final boolean eatVegetables;


    public Kangaroo() {
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
        return false;
    }
}
