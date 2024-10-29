package it.unibo;

/**
 * The Animal interface describes the basic characteristics of an animal, 
 * such as average weight, the ability to eat vegetables, and whether it 
 * can feed on other animals.
 */
public interface Animal {
    // return average weight of an animal in Kg
    double averageWeight();

    // Return true if animal eats vegetables
    boolean canEatVegetables();

    // return true if animal can eat the animal passed as parameter
    // can only eats animals that weight less
    boolean canEat(Animal a);
}
