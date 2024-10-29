package it.unibo;

public class Omnivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = true;   

    public String getDescription() {
        return "Bases on both, plants and meat.";
    }

    public boolean getEatVegetables() {
        return eatVegetables;
    }

    public boolean getEatMeat() {
        return eatMeat;
    }
}
