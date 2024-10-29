package it.unibo;

public class Kangaroo implements Animal {

    private static final double WEIGHT = 29.88;

    private Herbivore diet;
    private final double averageWeight;


    public Kangaroo() {
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
        if (diet.getEatMeat() == true) {
            if (a.averageWeight() < this.averageWeight) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
