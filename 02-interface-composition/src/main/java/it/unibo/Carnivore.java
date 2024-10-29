package it.unibo;

/**
 * The Carnivore class implements the Diet interface, representing 
 * animals that consume meat. 
 * This class provides information about the carnivorous diet 
 * and its characteristics.
 */
public class Carnivore implements Diet {

    private static final boolean VEGETABLES = false;
    private static final boolean MEAT = true;

    // returns false as carnivore do not consume vegetables.
    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    // returns true as carnivore consume meat.
    public boolean getEatMeat() {
        return MEAT;
    }

    // provides a description of the carnivore diet.
    public String getDescription() {
        return "Based on meat.";
    }
}
