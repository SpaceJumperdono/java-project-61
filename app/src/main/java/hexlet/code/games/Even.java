/**
 * The class is designed to implement the game Even number.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Even implements Game {
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task.
     * @author Pavel Mikheev
     * @return string with the task
     */
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * This method returns a question-answer pair for the Even game.
     * @author Pavel Mikheev
     * @return question-answer pair
     *
     */
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = Utils.generateValueWithRange();
        messageGame[0] = Integer.toString(genValue);
        boolean flagEven = checkEven(genValue);
        messageGame[1] = flagEven ? "yes" : "no";
        return messageGame;
    }

    /**
     * the method returns a string with the answer yes or no if the number is even.
     * @author Pavel Mikheev
     * @return string with the answer yes or no
     * @param value - check value for Even
     */

    public boolean checkEven(int value) {
        return value % 2 == 0;
    }
}
