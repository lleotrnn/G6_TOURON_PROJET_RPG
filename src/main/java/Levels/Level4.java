package Levels;

import Characters.*;
import Console.*;
import Customisation.House;
import Game.Story;
import Items.Potion;
import Spells.Spell;

public class Level4 {
    public static Wizard wizard;
    private AbstractEnemy enemy;
    private int turn = 1;
    private static boolean isRunning;
    public Level4() {

        Story.fourthLevelIntro();
        this.wizard = Level3.wizard;
        this.enemy = Enemy.VoldemortAndPeterPettigrow();
        isRunning = true;

    }

    public void startLevel4() {
        while (wizard.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
            hpInfo();
            playersActions();
            if (wizard.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
                turn++;
                enemyAction();
            }
            if (wizard.getCurrentHp() <= 0) {
                Display.printSeperator(25);
                Display.printTextWithColor("GAME OVER", Color.RED);
                Display.printSeperator(25);
                Display.printTextWithColor("You have been defeated by the " + enemy.getName() + "...\nBetter luck next time !", Color.RED);
                break;
            }
            if (enemy.getCurrentHp() <= 0) {
                wizard.chooseTrait();
            }
        }
    }


    public void hpInfo() {
        Display.printHeading("Turn " + turn + "!");
        Display.printTextWithColor("Your HP: " + wizard.getCurrentHp() + "/" + wizard.getMaxHp(), Color.GREEN);
        Display.printTextWithColor(enemy.getName() + "'s HP: " + enemy.getCurrentHp() + "/" + enemy.getMaxHp(), Color.RED);
    }


    public void playersActions() {
        Display.printHeading("What do you want to do?");
        Display.printTextWithColor("(1) Punch the enemy\n(2) Cast a spell\n(3) Defend\n(4) Use a potion", Color.BLACK);
        int playerChoice = InputParser.readInt("-> ",4);
        if(playerChoice == 1) {
            wizard.attack(enemy, 10);
        } else if(playerChoice == 2) {
            useSpell();
        } else if (playerChoice == 3){
            wizard.defend();
            wizard.stopDefending();
        } else {
            usePotion();
        }
    }

    public void useSpell() {
        Spell spell = Spell.chooseSpell();
        spell.setTarget(enemy);
        spell.castSpell();
    }

    public void usePotion() {
        Display.printHeading("Do you want to use a potion (+60 health points)?\n(1) Yes\n(2) Not now");
        int potionChoice = InputParser.readInt("-> ",2);
        if (potionChoice == 1) {
            wizard.usePotion(Potion.hpRestored, 60);
        } else {
            playersActions();
        }
    }

    public void enemyAction() {
        if (wizard.house == House.GRYFFINDOR) {
            enemy.attack(wizard, 1);
        } else {
            enemy.attack(wizard, 2);
        }
    }


}


