package Console;

import Console.Color;

import java.util.Scanner;

public class Display {

    static Scanner scanner = new Scanner(System.in);

    public static void printTextWithColor(String text, Color color){
        System.out.println(color.color + text + Color.BACK.color);
    }

    // Printing a seperator with length n
    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    // Simulating console cleaning

    public static void printHeading(String title) {
        printSeperator(25);
        printTextWithColor(title, Color.BLUE);
        printSeperator(25);
    }

    // Simulating console cleaning
    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // Stopping the game until user enters anything
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

}
