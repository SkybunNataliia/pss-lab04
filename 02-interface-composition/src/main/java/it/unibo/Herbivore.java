package it.unibo;

public class Herbivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = false;

    public String getDescription() {
        return "Based on plants, including leaves, fruits, flowers, seeds, and roots.";
    }

    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    public boolean getEatMeat() {
        return MEAT;
    }
}
