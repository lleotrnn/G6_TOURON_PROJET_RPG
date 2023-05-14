package Items;

import Characters.Character;
import Characters.Wizard;
import Customisation.House;
public class Potion {

    public static Potion hpRestored;
    private String name;
    private int potionPowerRate;


    public Potion(String name, int potionPowerRate) {
        this.name = name;
        this.potionPowerRate = potionPowerRate;
    }

}
