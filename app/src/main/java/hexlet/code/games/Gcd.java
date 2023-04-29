/**
 * The game implements a game with the least common divisor.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Gcd implements Game {
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task.
     * @author Pavel Mikheev
     * @return tring with the task
     */
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     * This method returns a question-answer pair for the GDC game.
     * @author Pavel Mikheev
     * @return question-answer pair
     */
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue1 = Utils.generateValueWithRange();
        int genValue2 = Utils.generateValueWithRange();

        messageGame[0] = genValue1 + " " + genValue2;

        String correctAnswer = Integer.toString(findGdc(genValue1, genValue2));
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    /**
     * method returns the least common divisor of two values.
     * @author Pavel Mikheev
     * @return least common divisor
     * @param value1 - first value for common divisor
     * @param value2 - second value for commin divisor
     */
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
