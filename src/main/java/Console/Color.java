package Console;

public enum Color {
    BLACK("\033[30m"),
    BLUE("\033[94m"),
    RED("\033[31m"),
    GREEN("\033[92m"),
    YELLOW("\033[33m"),
    BACK("\033[0m");
    final String color;
    Color(String color) {
        this.color = color;
    }
}
