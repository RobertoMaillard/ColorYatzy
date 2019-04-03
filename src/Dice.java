import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dice class rolls the dice.
 */

public class Dice {
    public static List<String> rollDice() {
        String[] diceColors = {"Black","Blue","Green","Red","White","Yellow"};
        Random random = new Random();
        List<String> diceThrow = new ArrayList<>();
        for (int i=0; i<5; i++) {
            int ind = random.nextInt(diceColors.length);
            String color = diceColors[ind];
            diceThrow.add(color);
        }
        return diceThrow;
    }
}
