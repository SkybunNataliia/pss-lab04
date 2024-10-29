package it.unibo;

public class SiameseCat implements Animal {
    private static final double WEIGHT = 4.5;

    private Carnivore diet;
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
