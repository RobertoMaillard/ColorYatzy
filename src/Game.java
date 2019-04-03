import java.util.*;

/**
 * Game class contains the game methods.
 */

public class Game {
    private List<Player> players;
    private int rounds;

    public Game() {
        Print.welcomeMessage();
        Print.rules();
    }

    public void selectPlayers() {
        Scanner playerScanner = new Scanner(System.in);
        Print.amountOfPlayers();
        int amountOfPlayers = playerScanner.nextInt();
        playerScanner.nextLine();
        List<Player> players = new ArrayList<>();
        for (int i=0; i<amountOfPlayers; i++) {
            Print.typeYourName(i+1);
            String playerName = playerScanner.nextLine();
            Player player = new Player(playerName);
            players.add(player);
        }
        this.players = players;

    }

    public void amountOfRounds() {
        Scanner roundScanner = new Scanner(System.in);
        Print.amountOfRounds();
        int amount = roundScanner.nextInt();
        roundScanner.nextLine();
        roundScanner.close();
        this.rounds = amount;
        System.out.println(); // Skips one line.
        Print.goodLuck();
    }

    public void initiateGame() {
        for (int i=0; i<rounds; i++) {
            round();
        }
        Collections.sort(players);
        for (Player player : players) {
            System.out.println(player.getName() + " scored " + player.getScore() + " points.");
        }
    }

    private void round() {
        for (Player player : players) {
            Print.playerRollDice(player.getName());
            List<String> rolledDice = Dice.rollDice();
            Print.rolledDice(player.getName(),rolledDice);
            Points points = new Points();
            HashMap<String,Integer> getPoints = points.getThePoints (rolledDice);
            for (String s : getPoints.keySet()) {
                player.setScore(getPoints.get(s));
                System.out.println(s + " Gives " + getPoints.get(s) + " points. Total score is "
                        + player.getScore() + ".\n");
            }

        }
    }
}