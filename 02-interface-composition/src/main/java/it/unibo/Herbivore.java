package it.unibo;

/**
 * The Herbivore class implements the Diet interface, representing 
 * animals that consume plant-based foods. 
 * This class provides information about the herbivorous diet 
 * and its characteristics.
 */
public class Herbivore implements Diet {

    private static final boolean VEGETABLES = true;
    private static final boolean MEAT = false;

    // returns true as herbivores consume vegetables.
    public boolean getEatVegetables() {
        return VEGETABLES;
    }

    // returns false as herbivores do not consume meat.
    public boolean getEatMeat() {
        return MEAT;
    }

    // provides a description of the herbivorous diet.
    public String getDescription() {
        return "Based on plants, including leaves, fruits, flowers, seeds, and roots.";
    }
}
