package it.unibo;

public class Herbivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = false;

    private final boolean eatVegetables;
    private final boolean eatMeat;

    public Herbivore() {
        this.eatVegetables = VEGETABLES;
        this.eatMeat = MEAT;
    }

    public String getDescription() {
        return "Bases on plants, including leaves, fruits, flowers, seeds, and roots.";
    }

    public boolean getEatVegetables() {
        return eatVegetables;
    }

    public boolean getEatMeat() {
        return eatMeat;
    }
}
