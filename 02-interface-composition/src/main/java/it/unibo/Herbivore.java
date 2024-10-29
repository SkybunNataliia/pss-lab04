package it.unibo;

public class Herbivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = false;

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
