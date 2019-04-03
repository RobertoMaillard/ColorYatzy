import java.util.List;

/**
 * Text print methods. Avoids muddy code.
 */

public class Print {
    public static void welcomeMessage() {
        System.out.println("- Welcome to Color Yatzy -");
    }
    public static void rules() {
        System.out.println("Take turns rolling the multi-colored dice " +
                        "and collect different color combinations that give points.\n" +
                        "The player with the most points wins the game.");
    }
    public static void amountOfPlayers() {
        System.out.println("Type the amount of players below.");
    }
    public static void amountOfRounds() {
        System.out.println("Type the amount of rounds below.");
    }
    public static void typeYourName(int i) {
        System.out.println("Player " + i + ", type your name below.");
    }
    public static void goodLuck () {
        System.out.println("Good luck players!\n");
    }
    public static void playerRollDice(String name) {
        System.out.println(name + "s turn to roll the dice.");
    }
    public static void rolledDice(String name, List<String> list) {
        System.out.print(name + " rolled a set of");
        for (String color : list) {
            System.out.print(" " + color + ".");
        }
        System.out.println();
    }
    public static void thankYou() {
        System.out.println("Thank you for playing Color Yatzy. Hope you enjoyed!");
    }
}
