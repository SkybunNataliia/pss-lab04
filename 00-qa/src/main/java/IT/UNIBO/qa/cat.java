package it.unibo.qa;

/**
 * The class Cat describes a cat.
 * That can have name, color, breed and age.
 */
public class Cat {

    /**
     * Principal fields of class Cat.
     */
    private final String name;
    private String color;
    private final String breed;
    private int age;

    /**
     * Constructor of class Cat.
     * 
     * @param name Name of the cat
     * @param color Color of the cat
     * @param breed Breed of the cat
     * @param age Age of the cat
     */
    public Cat(final String name, String color, final String breed, int age) {

        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    /**
     * This method is useful because it allows the cat to meow and
     * introduce itself to the world in a single line of code.
     * 
     * @return String of the cats meow
     */
    public String meow() {
        return "Meow, meow, I am " +
                this.name +
                ", hear me purr, In this feline world," +
                "I'm the star, that's for sure." +
                "With whiskers long and fur so sleek," +
                "I'm here to share my story, so take a peek!";
    }

    /**
     * This method allows to set color of the cat.
     * 
     * @param color The color of cat.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method return the color of a cat.
     * 
     * @return The color of the cat
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This method return true if the color of the cat is equal to color of the cat passed as parameter.
     * 
     * @param cat Other object of class Cat.
     * @return If the cats have the same color
     */
    public boolean hasSameColor(Cat  cat) {
        return this.color == cat.color;
    }

    /**
     * This method return the name of a cat.
     * 
     * @return The name of the cat
     */
    String getName() {
        return this.name;
    }

    /**
     * This method return the breed of a cat.
     * 
     * @return The breed of the cat
     */
    String breed() {
        return this.breed;
    }

    public static void main(final String[] args) {
        Cat cat = new Cat("Kiri", "Gray", "Koratcat", 4);
        System.out.println(cat.meow());
    }
}
