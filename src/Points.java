import java.util.HashMap;
import java.util.List;

/**
 * Points class contains a method that takes a ArrayList of colors returned by the method rollDice in the
 * Dice class and converts it to a HashMap of colors and the amount.
 * Returns a HashMap with one entry. A string representing the rolled dice and the points.
 */

public class Points {

    public HashMap<String,Integer> getThePoints (List<String> list) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String string : list) {
            if (!map.containsKey(string)) {
                map.put(string,1);
            }
            else {
                map.put(string,map.get(string)+1);
            }
        }
        int points = 0;
        String outcome = "";
        for (String s : map.keySet()) {
            switch (map.get(s)) {
                case 1:
                    // No points
                    break;
                case 2:
                    points += 2;
                    outcome += " One pair of " + s + ".";
                    break;
                case 3:
                    points += 3;
                    outcome += " Three of a kind of " + s + ".";
                    break;
                case 4:
                    points += 7;
                    outcome += " Four of a kind of " + s + ".";
                    break;
                case 5:
                    points += 10;
                    outcome += " Yatzy of " + s + ".";
                    break;
            }
        }
        map.clear();
        map.put(outcome,points);
        return map;

    }
}
