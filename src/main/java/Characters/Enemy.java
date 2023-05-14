package Characters;

import Console.Display;
import Console.Color;

public class Enemy extends AbstractEnemy {

    private int spellCount = 0;

    public Enemy(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack(Character character, int attackPower) {
        int damage = attackPower - character.getDefense();
        character.damageTaken(damage);
        Display.printTextWithColor(getName() + " attacks " + character.getName() + " and dealt " + damage + " damage.", Color.RED);
    }

    @Override
    public void damageTaken(int damage) {
        int actualDamage = Math.max(damage - getDefense(), 0);
        setCurrentHp(getCurrentHp() - actualDamage);
        Display.printTextWithColor(getName() + " takes " + actualDamage + " points of damage.", Color.RED);

        if (getCurrentHp() <= 0) {
            die();
        }
    }


    public static AbstractEnemy Troll() {
        return new Enemy("Troll", 100);
    }
    public static AbstractEnemy Basilisk() {
        return new Enemy("Basilisk", 100);
    }
    public static AbstractEnemy Dementor() {return new Enemy("Dementor", 100);}
    public static AbstractEnemy VoldemortAndPeterPettigrow() {return new Enemy("Voldemort And Peter Pettigrow", 500);}
    public static AbstractEnemy DoloresOmbrage() {return new Enemy("Dolores Ombrage", 350);}
    public static AbstractEnemy DeathEaters() {return new Enemy("DeathEaters", 100);}
    public static AbstractEnemy VoldemortAndBellatrixLestrange() {return new Enemy("Voldemort And Bellatrix Lestrange", 500);}
}

