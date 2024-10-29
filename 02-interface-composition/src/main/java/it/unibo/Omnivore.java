package it.unibo;

/**
 * The Omnivore class implements the Diet interface, representing 
 * animals that consume both plant and animal-based foods. 
 * This class provides information about the omnivorous diet 
 * and its characteristics.
 */
public class Omnivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = true;  

    // returns true as omnivore consume vegetables.
    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    // returns true as omivore consume meat.
    public boolean getEatMeat() {
        return MEAT;
    }

    // provides a description of the omnivore diet.
    public String getDescription() {
        return "Based on both, plants and meat.";
    }
}
