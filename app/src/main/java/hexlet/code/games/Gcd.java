/**
 * The game implements a game with the least common divisor
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Gcd implements Game {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;

    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }
    public String[] getDataPair() {

        String[] messageGame = new String[SIZE_ARRAY];
        int genValue1 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int genValue2 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);

        messageGame[0] = genValue1 + " " + genValue2;

        String correctAnswer = Integer.toString(findGdc(genValue1, genValue2));
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    public int findGdc(int value1, int value2) {
        while (value1 != 0 && value2 != 0) {
            if (value1 > value2) {
                value1 = value1 % value2;
            } else {
                value2 = value2 % value1;
            }
        }
        return value1 + value2;
    }
}
