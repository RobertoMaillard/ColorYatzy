/**
 * Keep track of the name and the points of each individual player.
 */

public class Player implements Comparable<Player> {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    @Override
    public int compareTo(Player p) {

        return p.score - this.score;
    }
}
