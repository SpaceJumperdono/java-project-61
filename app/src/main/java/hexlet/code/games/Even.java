/**
 * The class is designed to implement the game Even number
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Even implements Game {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task
     * @author Pavel Mikheev
     */
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * This method returns a question-answer pair for the Even game
     * @author Pavel Mikheev
     */
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        messageGame[0] = Integer.toString(genValue);
        String correctAnswer = checkEven(genValue);
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    /**
     * the method returns a string with the answer yes or no if the number is even
     * @author Pavel Mikheev
     */

    public String checkEven(int value) {
        return value % 2 == 0 ? "yes" : "no";
    }
}
