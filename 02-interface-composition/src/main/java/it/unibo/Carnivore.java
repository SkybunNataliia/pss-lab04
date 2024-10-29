package it.unibo;

public class Carnivore implements Diet {

    private static final boolean VEGETABLES = false;
    private static final boolean MEAT = true;

    public String getDescription() {
        return "Based on meat.";
    }

    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    public boolean getEatMeat() {
        return MEAT;
    }
}
