package Spells;

import Console.Color;
import Console.Display;
import Console.InputParser;
import Characters.Character;
import Customisation.House;
import Levels.Level1;
import java.util.Random;

public class Spell extends AbstractSpell {

    private static final Spell WINGARDIUM_LEVIOSA = new Spell("WINGARDIUM_LEVIOSA", 50);
    private static final Spell ACCIO = new Spell("ACCIO", 10);
    private static final Spell EXPELLIARMUS = new Spell("EXPELLIARMUS", 40);
    private static final Spell EXPECTO_PATRONUM = new Spell("EXPECTO_PATRONUM", 60);
    private static final Spell SECTUMSEMPRA = new Spell("SECTUMSEMPRA", 70);
    private static final Spell AVADA_KEDAVRA = new Spell("AVADA_KEDAVRA", 400);


    public Spell(String name, int spellPower) {
        super(name, spellPower);
        this.spellPower = spellPower;
    }

    public int getSpellPower() {
        return spellPower;
    }


    public static Spell chooseSpell() {
        Display.printHeading("Choose a spell to cast:");
        Display.printTextWithColor("WINGARDIUM_LEVIOSA: 50 spell power\nACCIO: 10 spell power\nEXPELLIARMUS: 40 spell power\nEXPECTO_PATRONUM: 60 spell power\nSECTUMSEMPRA: 70 spell power\nAVADA_KEDAVRA: 400 spell power", Color.BLACK);
        int spellChoice = InputParser.readInt("-> ", 6);
        if(spellChoice == 1) {
            return WINGARDIUM_LEVIOSA;
        } else if(spellChoice == 2) {
            return ACCIO;
        } else if(spellChoice == 3) {
            return EXPELLIARMUS;
        } else if(spellChoice == 4) {
            return EXPECTO_PATRONUM;
        } else if(spellChoice == 5) {
            return SECTUMSEMPRA;
        } else if(spellChoice == 6) {
            return AVADA_KEDAVRA;
        }else {
            Display.printTextWithColor("Invalid choice, please choose again.", Color.RED);
            return chooseSpell();
        }
    }


    @Override
    public void castSpell() {

        Random random = new Random();
        int rand = random.nextInt();

        house = Level1.wizard.getHouse();

        if(((house == House.GRYFFINDOR || house == House.HUFFLEPUFF || house == House.SLYTHERIN) && rand < 3) || (house == House.RAVENCLAW && rand < 0.1)){
            Character target = getTarget();
            int spellPower = getSpellPower();
            if(target == null) {
                Display.printTextWithColor(getName() + "'s spell has no effect, no target selected !", Color.RED);
                return;
            }
            if(house == House.SLYTHERIN) {
                spellPower *= 1.25;
            }

            int damage = spellPower - target.getDefense();
            if(damage <= 0) {
                Display.printTextWithColor(getName() + "'s spell was ineffective against " + target.getName() + "!", Color.RED);
            } else {
                Display.printTextWithColor(getName() + " casts a spell on " + target.getName() + " for " + damage + " damage!", Color.GREEN);
                target.damageTaken(damage);
            }
        } else {
            Display.printTextWithColor(getName() + " failed to cast!", Color.RED);
        }
    }

}


