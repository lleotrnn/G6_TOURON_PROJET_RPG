package Characters;

import Console.Display;
import Console.Color;
import Console.InputParser;
import Customisation.*;
import Items.*;
import Spells.Spell;

import java.util.ArrayList;
import java.util.List;

public class Wizard extends Character {

    // Integers to store number of upgrades/skills in each path
    private int hp;
    private int spellPower;
    private boolean defending;
    private Pet pet;
    private Wand wand;
    public House house;
    private List<Potion> potions;
    private List<Spell> knownSpells;

    public Wizard(String name, int hp) {
        // Calling constructor of superclass
        super(name, hp);
        this.hp = hp;
        potions = new ArrayList<>();
        knownSpells = new ArrayList<>();
        spellPower = 10;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Potion> getPotions() {
        return potions;
    }
    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }

    public void addPotion(Potion potion) {
        potions.add(potion);
    }

    public boolean hasPotion(Potion potion) {
        return potions.contains(potion);
    }

    public void removePotion(Potion potion) {
        potions.remove(potion);
    }

    public void attack(Character character, int attackPower) {
        int damage = attackPower - character.getDefense();
        if (damage <= 0) {
            Display.printTextWithColor(getName() + "'s attack was ineffective against " + character.getName() + "!", Color.RED);
        } else {
            damage = Math.max(1, damage); // On s'assure que les dégâts infligés sont au moins de 1.
            Display.printTextWithColor(getName() + " attacks " + character.getName() + " and dealt " + damage + " damage.", Color.BLUE);
            character.damageTaken(damage);
        }
    }
    public void defend() {
        setDefense(getDefense() + 15);
        Display.printTextWithColor(getName() + " managed to defend the enemy's attack!", Color.GREEN);
    }

    public boolean isDefending() {
        return getDefense() > 0;
    }

    public void stopDefending() {
        setDefense(getDefense() - 15);
        if (!isDefending()) {
            Display.printTextWithColor(getName() + " stopped defending.", Color.BLACK);
        }
    }

    public void usePotion(Potion potion, int hp) {
        if (house == House.HUFFLEPUFF) {
            hp *= 1.5;
        }
        if (potions.contains(potion)) {
            potions.remove(potion);
            setHp(Math.min(getCurrentHp() + hp, getMaxHp()));

        } else {
            Display.printTextWithColor("You don't have that potion in your inventory!", Color.RED);
        }
    }

    // Let the wizard choose a trait of either skill path
    public void chooseTrait() {
        Display.clearConsole();
        Display.printHeading("Choose a trait : ");
        Display.printTextWithColor("(1) +12 bonus health points", Color.BLACK);
        Display.printTextWithColor("(2) +6 bonus spell power points", Color.BLACK);
        // Get the wizards choice
        int traitChoice = InputParser.readInt("-> ", 2);
        Display.clearConsole();
        // Dealing with both cases
        if(traitChoice == 1) {
            Display.printHeading("You chose the bonus health !");
            this.maxHp += 12;
        } else {
            Display.printHeading("You chose the bonus spell power!");
            this.spellPower += 6;
        }
        Display.anythingToContinue();
    }

}
