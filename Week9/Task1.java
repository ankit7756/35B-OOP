// Task
// Make a class Pant
// Add two attribute color and texture
// Make constructor or Pant that takes color and texture 
// Make a class HalfPant that extends Pant
// Make a attribute color and add default String White
// Make a non param constructor of HalfPant and \
// call the Parameterized constructor of parent Pant with "Black" and "Wool"
// Make a function design() in HalfPant that takes String color \
// change the parent color to current color of halfpant
// change the current color of half pant to provided parameter

package Week9;

public class Task1 {
    public static void main(String[] args) {
        HalfPant myHalfPant = new HalfPant();
        System.out.println("Initial HalfPant color: " + myHalfPant.getColor()); // Should print "White"
        System.out.println("Parent Pant color: " + myHalfPant.getPantColor()); // Should print "Black"
        System.out.println("Parent Pant texture: " + myHalfPant.getPantTexture()); // Should print "Wool"

        // Change design
        myHalfPant.design("Red");
        System.out.println("After design change:");
        System.out.println("New HalfPant color: " + myHalfPant.getColor()); // Should print "Red"
        System.out.println("Parent Pant color: " + myHalfPant.getPantColor()); // Should print "White"
    }
}

// Class Pant
class Pant {
    private String color;
    private String texture;

    // Constructor for Pant that takes color and texture
    public Pant(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for texture
    public String getTexture() {
        return texture;
    }
}

// Class HalfPant that extends Pant
class HalfPant extends Pant {
    private String color;

    // Non-parameterized constructor for HalfPant
    public HalfPant() {
        super("Black", "Wool");
        this.color = "White";
    }

    // Getter for HalfPant color
    public String getColor() {
        return color;
    }

    // Getter for Pant color
    public String getPantColor() {
        return super.getColor();
    }

    // Getter for Pant texture
    public String getPantTexture() {
        return super.getTexture();
    }

    // Method design to change colors
    public void design(String newColor) {
        super.setColor(this.color); // Change parent Pant color to current HalfPant color
        this.color = newColor;      // Change current HalfPant color to the provided parameter
    }
}
