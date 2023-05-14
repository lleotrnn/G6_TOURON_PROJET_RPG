package Characters;

import Console.Display;
import Console.Color;

import java.util.Random;

public abstract class AbstractEnemy extends Character {

    public AbstractEnemy(String name,int maxHp) {
        super(name, maxHp);
    }

    public void attack(Character character, int attackPower) {
        int damage = attackPower - character.getDefense();
        character.damageTaken(damage);
        Display.printTextWithColor(getName() + " attacks " + character.getName() + " and dealt " + damage + " damage.", Color.RED);
    }

    public void defend() {
        setDefense(getDefense() + new Random().nextInt(8));
        Display.printTextWithColor(getName() + " managed to defend your attack!", Color.GREEN);
    }

    public void damageTaken(int damage) {
        int actualDamage = Math.max(damage - getDefense(), 0);
        setCurrentHp(getCurrentHp() - actualDamage);
        Display.printTextWithColor(getName() + " takes " + actualDamage + " points of damage.", Color.RED);
        if (getCurrentHp() <= 0) {
            die();
        }
    }

    public void die() {
        Display.printTextWithColor(getName() + " has been defeated!", Color.GREEN);
    }

}
