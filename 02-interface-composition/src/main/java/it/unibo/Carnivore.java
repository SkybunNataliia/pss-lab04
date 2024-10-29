package it.unibo;

public class Carnivore implements Diet {

    private static final boolean VEGETABLES = false;
    private static final boolean MEAT = true;

    public String getDescription() {
        return "Bases on meat.";
    }

    public boolean getEatVegetables() {
        return eatVegetables;
    }

    public boolean getEatMeat() {
        return eatMeat;
    }
}
