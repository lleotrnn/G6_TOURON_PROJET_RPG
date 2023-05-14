package Spells;

import Characters.Character;
import Customisation.House;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractSpell {
    private String name;
    public Character target;
    public int spellPower;
    public House house;


    public AbstractSpell(String name,int spellPower) {
        this.name = name;
        this.spellPower = spellPower;
    }

    public String getName() {
        return name;
    }


    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public void castSpell() {
    }
}
