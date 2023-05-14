package Game;

import Console.Color;
import Console.Display;
import Characters.*;

// Printing out every part of the story
public class Story {

    // Add the story of all levels
    public static void printIntro() {
        Display.clearConsole();
        Display.printSeperator(25);
        Display.printHeading("HARRY POTTER AT HOME");
        Display.printTextWithColor("Do you have the makings of the greatest wizards? Can you meet all the challenges?\nLet's get started!\nYour goal is to complete your education at Hogwarts. Each year will be filled with challenges.", Color.BLUE);
        Display.printSeperator(25);
        Display.anythingToContinue();
    }

    public static void firstLevelIntro() {
        Display.printHeading("LEVEL 1 - THE PHILOSOPHER'S STONE");
        Display.printTextWithColor("You are facing the evil troll in the toilet next to the Dungeon. To defeat him, you must lift objects and release them when they are above his head.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void firstLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 1 - OUTRO");
        Display.printTextWithColor("Well done ! You defeated the evil troll !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void secondLevelIntro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 2 - THE CHAMBER OF SECRETS");
        Display.printTextWithColor("You are facing the terrible basilisk. If you are from Griffondor, you can call upon the legendary sword of Godric Gryffindor's legendary sword to strike him down. Otherwise, you'll have to rip out one of its fangs and use it to destroy Tom Jedusor's diary.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void secondLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 2 - OUTRO");
        Display.printTextWithColor("Well done ! You defeated the terrible basilisk !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void thirdLevelIntro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 3 - THE PRISONNER OF AZKABAN");
        Display.printTextWithColor("The Dementors are on the loose. They roam the streets, the countryside. Fortunately, you've heard about a spell to put them to flight : Expectro Patronum.\tYour goal is to learn the spell, then use it to defeat the Destroyers.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void thirdLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 3 - OUTRO");
        Display.printTextWithColor("Congratulations ! You learned the spell named Expectro Patronum and you defeated all the Dementors thanks to it !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void fourthLevelIntro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 4 - THE GOBLET OF FIRE");
        Display.printTextWithColor("You are in the graveyard, where Voldemort and Peter Pettigrew are also. Your only chance to escape is to get close to the Portkey and lure him to you (Accio!).", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void fourthLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 4 - OUTRO");
        Display.printTextWithColor("Well done ! You managed to escape !\tDon't worry, you'll see Voldemort again.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void fifthLevelIntro() {
        Display.clearConsole();
        System.out.println("LEVEL 5 - THE ORDER OF THE PHENIX");
        Display.printTextWithColor("You are in the Great Hall, where Dolores Ombrage is watching over the grain. Your goal is to distract her until the fireworks are ready to be used.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void fifthLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 5 - OUTRO");
        Display.printTextWithColor("Well done ! You managed to distract her until the fireworks are ready to be used !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void sixthLevelIntro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 6 - THE HALF-BLOOD PRINCE");
        Display.printTextWithColor("The Death Eaters are attacking Hogwarts. Are you ready to defend yourselves?\nYou must attack them from the front (Sectumsempra).\nIf you are a Slytherin, you may decide to join the ranks of the Death Eaters.", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void sixthLevelOutro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 6 - OUTRO");
        Display.printTextWithColor("Well done ! You managed to defend Hogwarts from the Death Eaters !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void seventhLevelIntro() {
        Display.clearConsole();
        Display.printHeading("LEVEL 7 - THE DEATHLY HALLOWS");
        Display.printTextWithColor("Let's stop stalling and get to the root of the problem. You are facing Voldemort and Bellatrix Lestrange.\nBe careful, they can kill you with Avada Kedavra at once if you are not are not ready !", Color.BLUE);
        Display.anythingToContinue();
    }

    public static void printEnd() {
        Display.clearConsole();
        Display.printHeading("LEVEL 7 - OUTRO");
        Display.printTextWithColor("Congratulations ! You defeated Voldemort and Bellatrix Lestrange !\tYou finished all the levels !\nThis game was developed by TOURON Leo.\nEND", Color.BLUE);
        Display.anythingToContinue();
    }
}
