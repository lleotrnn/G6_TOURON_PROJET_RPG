package Console;

import java.util.Scanner;

public class InputParser {

    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch(Exception e) {
                input = -1;
                Display.printTextWithColor("Invalid input, please try again.", Color.RED);
            }
        } while(input < 1 || input > userChoices);
        return input;
    }
}
