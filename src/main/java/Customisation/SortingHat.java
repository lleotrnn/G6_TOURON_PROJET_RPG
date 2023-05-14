package Customisation;

import Console.Color;
import Console.Display;
import Console.InputParser;

public class SortingHat {
    public static House sort() {
        Display.printTextWithColor("Welcome to Hogwarts Sorting Hat ceremony!\nI am the Sorting Hat, and I will determine your Hogwarts house. I will ask you a series of questions, and you must answer truthfully. I will then decide which house you belong in.\nAre you ready?", Color.YELLOW);
        Display.anythingToContinue();
        Display.printTextWithColor("Very well, let's begin.\nWhich of these words best describes you?", Color.YELLOW);
        Display.printTextWithColor("   (1) Brave \n   (2) Intelligent\n   (3) Loyal\n   (4) Ambitious", Color.BLACK);
        int houseChoice = InputParser.readInt(" ->", 4);
        if (houseChoice == 1) {
            Display.printTextWithColor("Interesting, very interesting. You have a lot of courage.", Color.YELLOW);
            Display.printTextWithColor("2. Which of these traits do you value the most?\n   (1) Intelligence and wit\n   (2) Kindness and empathy\n   (3) Resourcefulness and cunning\n   (4) None of the above", Color.BLACK);
            houseChoice = InputParser.readInt(" ->", 4);
            if (houseChoice == 1) {
                Display.printTextWithColor("You are clever as well as brave. Perhaps you belong in RAVENCLAW.", Color.GREEN);
                return House.RAVENCLAW;
            } else if (houseChoice == 2) {
                Display.printTextWithColor("You have a good heart, but perhaps not as sharp a mind.", Color.YELLOW);
                Display.printTextWithColor("3. Which of these traits do you possess?\n   (1) Patience and empathy\n   (2) Resourcefulness and cunning\n   (3) Loyalty and hard work\n   (4) None of the above", Color.BLACK);
                houseChoice = InputParser.readInt(" ->", 4);
                if (houseChoice == 1) {
                    Display.printTextWithColor("You are patient and empathetic, and have a good heart. Welcome to HUFFLEPUFF.", Color.GREEN);
                    return House.HUFFLEPUFF;
                } else if (houseChoice == 3) {
                    Display.printTextWithColor("You are hard-working and a good friend. Your house is GRYFFINDOR!", Color.GREEN);
                    return House.GRYFFINDOR;
                } else {
                    Display.printTextWithColor("Sorry, your answers do not match any of the available options. Let's try again.", Color.YELLOW);
                    return sort();
                }
            } else if (houseChoice == 3) {
                Display.printTextWithColor("You are resourceful and cunning, and will do well in SLYTHERIN.", Color.GREEN);
                return House.SLYTHERIN;
            } else {
                Display.printTextWithColor("Sorry, your answers do not match any of the available options. Let's try again.", Color.YELLOW);
                return sort();
            }
        } else {
            Display.printTextWithColor("I see, you are not particularly brave.", Color.YELLOW);
            Display.printTextWithColor("2. Which of these traits do you value the most?\n   (1) Intelligence and wit\n   (2) Kindness and empathy\n   (3) Resourcefulness and cunning\n   (4) None of the above", Color.BLACK);
            houseChoice = InputParser.readInt(" ->", 4);
            if (houseChoice == 1) {
                Display.printTextWithColor("You are clever and resourceful, and will do well in SLYTHERIN.", Color.GREEN);
                return House.SLYTHERIN;
            } else if (houseChoice == 2) {
                Display.printTextWithColor("You have a kind heart, but perhaps not as sharp a mind or strong a will.", Color.YELLOW);
                Display.printTextWithColor("3. Which of these traits do you possess?\n   (1) Patience and empathy\n   (2) Resourcefulness and cunning\n   (3) Loyalty and hard work\n   (4) None of the above", Color.BLACK);
                houseChoice = InputParser.readInt(" ->", 4);
                if (houseChoice == 1) {
                    Display.printTextWithColor("You are patient and empathetic, and have a good heart. Welcome to HUFFLEPUFF.", Color.GREEN);
                    return House.HUFFLEPUFF;
                } else if (houseChoice == 3) {
                    Display.printTextWithColor("You are hard-working and a good friend. Your house is GRYFFINDOR!", Color.GREEN);
                    return House.GRYFFINDOR;
                } else {
                    Display.printTextWithColor("Sorry, your answers do not match any of the available options. Let's try again.", Color.YELLOW);
                    return sort();
                }
            } else if (houseChoice == 3) {
                Display.printTextWithColor("You are resourceful and cunning, but lack the bravery to be in SLYTHERIN.", Color.YELLOW);
                Display.printTextWithColor("3. Which of these traits do you possess?\n   (1) Patience and empathy\n   (2) Loyalty and hard work\n   (3) Intelligence and wit\n   (4) None of the above", Color.BLACK);
                houseChoice = InputParser.readInt(" ->", 4);
                if (houseChoice == 1) {
                    Display.printTextWithColor("You are patient and empathetic, and have a good heart. Welcome to HUFFLEPUFF.", Color.GREEN);
                    return House.HUFFLEPUFF;
                } else if (houseChoice == 2) {
                    Display.printTextWithColor("You are hard-working and a good friend. Your house is GRYFFINDOR!", Color.GREEN);
                    return House.GRYFFINDOR;
                } else if (houseChoice == 3) {
                    Display.printTextWithColor("You are clever and intelligent, and belong in RAVENCLAW.", Color.GREEN);
                    return House.RAVENCLAW;
                } else {
                    Display.printTextWithColor("Sorry, your answers do not match any of the available options. Let's try again.", Color.YELLOW);
                    return sort();
                }
            } else {
                Display.printTextWithColor("Sorry, your answers do not match any of the available options. Let's try again.", Color.YELLOW);
                return sort();
            }
        }
    }
}
