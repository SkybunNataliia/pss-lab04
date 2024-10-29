package it.unibo;

public interface Animal {
    // return average weight of an animal in Kg
    double averageWeight();

    // Return true if animal eats vegetables
    boolean canEatVegetables();

    // return true if animal can eat the animal passed as parameter
    // can only eats animals that weight less
    boolean canEat(Animal a);
}
