package Spells;

import Console.Display;
import Console.Color;

public class ForbiddenSpell extends Spell {
    public ForbiddenSpell(String name, int spellPower) {
        super(name, spellPower);
    }

    @Override
    public void castSpell() {
        Display.printTextWithColor(getName() + " is a forbidden spell and should not be used!", Color.RED);
    }
}