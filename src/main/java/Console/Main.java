package Console;

import Levels.*;
import Game.Story;


public class Main {
    public static void main(String[] args) {

        // ======== IMPORTANT ========
        // Lorsque vous voulez run le code, il faut changer la configuration.
        // Select Run/Debug Configuration -> Current File
        // ======== IMPORTANT ========

        // Inspiré d'un tuto Youtube (Playlist : "Java Text RPG Tutorial") et de ChatGPT pour les bases d'un RPG et de fonctions à implémenter
        // Inspiré de Hogwarts Legacy pour le questionnaire du Choipeau

        Level1 lvl1 = new Level1();
        lvl1.startLevel1();
        Story.firstLevelOutro();
        Level2 lvl2 = new Level2();
        lvl2.startLevel2();
        Story.secondLevelOutro();
        Level3 lvl3 = new Level3();
        lvl3.startLevel3();
        Story.thirdLevelOutro();
        Level4 lvl4 = new Level4();
        lvl4.startLevel4();
        Story.fourthLevelOutro();
        Level5 lvl5 = new Level5();
        lvl5.startLevel5();
        Story.fifthLevelOutro();
        Level6 lvl6 = new Level6();
        lvl6.startLevel6();
        Story.sixthLevelOutro();
        Level7 lvl7 = new Level7();
        lvl7.startLevel7();
        Story.printEnd();

    }

}