// 10. You are developing a game in Java. 
// The game has a base class Character with a method attack() that displays the basic attack action of the character. 
// Now, you need to create two derived classes Warrior and Mage that inherit from Character 
// and override the attack() method to display their specific attack actions. 
// Write the code to demonstrate method overriding for character attacks in the game


package Week11;

public class P10 {
    public static void main(String[] args) {
        Character warrior = new Warrior("AK-47", "Hunter");
        Character mage = new Mage("Atomic Bomb", "Abdul");
        warrior.attack();
        mage.attack();
    }
}

abstract class Character {
    abstract void attack();
}

class Warrior extends Character {
    private String weapon;
    private String name;

    public Warrior(String weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with " + weapon + ": Fire the gun type shiiiiii");
    }
}

class Mage extends Character {
    private String spell;
    private String name;

    public Mage(String spell, String name) {
        this.spell = spell;
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts " + spell + ": Drop the fatass nukeee");
    }
}
