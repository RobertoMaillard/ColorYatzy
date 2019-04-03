public class Main {

    /**
     * Author (Roberto Maillard)
     * Version (1.1)
     * Date (2019.04.03)
     * Running Main class initiates the game of Color Yatzy.
     * Type in the amount of players and their names.
     * Type in the amount of rounds.
     */

    public static void main(String[] args) {
        Game game = new Game();
        game.selectPlayers();
        game.amountOfRounds();
        game.initiateGame();
        Print.thankYou();
    }
}