package it.unibo;

public class Omnivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = true;   

    public String getDescription() {
        return "Based on both, plants and meat.";
    }

    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    public boolean getEatMeat() {
        return MEAT;
    }
}
