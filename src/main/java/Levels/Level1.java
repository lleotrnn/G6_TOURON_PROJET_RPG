package Levels;

import Characters.*;
import Console.*;
import Customisation.House;
import Game.Story;
import Customisation.SortingHat;
import Items.Potion;
import Spells.Spell;

import java.util.Scanner;

public class Level1 {
    static Scanner scanner = new Scanner(System.in);
    public static Wizard wizard;
    private AbstractEnemy enemy;
    private int turn = 1;
    private static boolean isRunning;
    public Level1() {

        Display.clearConsole();
        Display.printSeperator(25);
        Display.printHeading("Harry Potter at Home\nMade by TOURON Leo");
        Display.printSeperator(25);
        Display.anythingToContinue();

        Story.printIntro();

        boolean nameSet = false;
        String name;
        do {
            Display.clearConsole();
            Display.printHeading("Name your character.");
            name = scanner.next();
            Display.clearConsole();
            Display.printHeading("Your name is " + name + ".\nIs that correct ?");
            Display.printTextWithColor("(1) Yes !\n(2) No, I want to change my name.", Color.BLACK);
            int nameChoice = InputParser.readInt("-> ", 2);
            if (nameChoice == 1) {
                nameSet = true;
            }
        } while (!nameSet);
        Display.printSeperator(25);
        this.wizard = new Wizard(name, 100);
        this.wizard.setHouse(SortingHat.sort());
        Display.printTextWithColor(wizard.getName() + " have been sorted into " + wizard.getHouse().name() + " !", Color.GREEN);
        this.wizard.setHp(100);
        for (int i = 0; i < 10; i++) {
            this.wizard.addPotion(Potion.hpRestored);
        }

        Story.firstLevelIntro();
        this.enemy = Enemy.Troll();
        isRunning = true;
    }

    public void startLevel1() {
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


