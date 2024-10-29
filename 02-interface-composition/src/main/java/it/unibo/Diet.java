package it.unibo;

/**
 * The Diet interface defines the dietary habits of an animal, 
 * indicating whether the animal consumes vegetables, meat, or both.
 */
public interface Diet {
    boolean getEatVegetables();
    boolean getEatMeat();
    String getDescription();
}
