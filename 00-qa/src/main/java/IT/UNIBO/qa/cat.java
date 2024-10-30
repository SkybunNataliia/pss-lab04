package IT.UNIBO.qa;

/**
 * The class Cat describes a cat.
 * That can have name, color, breed and age.
 */
public class Cat {

    private static int  NINE = 9;
    static public  int numberoflives= NINE;

    private final String Name;
    private String Color;
    private final String Breed;
    private int Age;

    /**
     * Constructor of class Cat
     */
    public Cat(final String name, String color, final String breed, int age) {
        this.Name = name;
        this.Color = color;
        this.Breed= breed;
        this.Age = age;
    }

    /**
     * This method is useful because it allows the cat to meow and
     * introduce itself to the world in a single line of code.
     */
    public String meow() {
        return "Meow, meow, I am " + this.Name + ", hear me purr, In this feline world, I'm the star, that's for sure. With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    /**
     * This method allows to set color of the cat.
     */
    public void setColor(String color) {
        this.Color = color;
    }

    /**
     * This method return the color of a cat.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * This method return true if the color of the cat is equal to color of the cat passed as parameter.
     */
    public boolean hasSameColor(Cat  cat) {
        return Color==cat.Color;
    }

    /**
     * This method return the name of a cat.
     */
    String getName() {
        return this.Name;
    }

    /**
     * This method return the breed of a cat.
     */
    String breed() {
        return this.Breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri", "Gray", "Koratcat", 4);
        System.out.println(cat.meow());
    }
}
