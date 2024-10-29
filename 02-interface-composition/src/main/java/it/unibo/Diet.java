package it.unibo;

/**
 * The Diet interface defines the dietary habits of an animal, 
 * indicating whether the animal consumes vegetables, meat, or both.
 */
public interface Diet {
    // return true if the animal consumes vegetables
    boolean getEatVegetables();

    // return true if the animal consumes meat
    boolean getEatMeat();

    // return a brief description of the specific diet
    String getDescription();
}
