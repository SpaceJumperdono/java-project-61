/**
 * The class implements the calculator game.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Calculator implements Game {
    public static final int NUMBER_OPERATION = 3;
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task.
     * @author Pavel Mikheev
     * @return string with the task
     */

    public String getTask() {
        return "What is the result of the expression?";
    }

    /**
     * This method returns a question-answer pair for the Calculator game.
     * @author Pavel Mikheev
     * @return question-answer pair
     */
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genOperation = 1 + (int) (Math.random() * NUMBER_OPERATION + 1);
        int genValue1 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int genValue2 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int result = 0;
        String question = "";
        switch (genOperation) {
            case 1:
                result = genValue1 + genValue2;
                question = genValue1 + " + " + genValue2;
                break;
            case 2:
                result = genValue1 - genValue2;
                question = genValue1 + " - " + genValue2;
                break;
            default:
                result = genValue1 * genValue2;
                question = genValue1 + " * " + genValue2;
                break;

        }
        messageGame[0] = question;
        messageGame[1] = Integer.toString(result);
        return messageGame;
    }
}
