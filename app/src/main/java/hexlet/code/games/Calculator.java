/**
 * The class implements the calculator game.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Calculator implements Game {
    public static final int NUMBER_OPERATION = 3;
    public static final int SIZE_ARRAY = 2;
    public static final int SUM = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;

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
        int genOperation = Utils.generateSpecialValue(NUMBER_OPERATION);
        int genValue1 = Utils.generateValueWithRange();
        int genValue2 = Utils.generateValueWithRange();
        int result = 0;
        String question = "";
        switch (genOperation) {
            case SUM:
                result = genValue1 + genValue2;
                question = genValue1 + " + " + genValue2;
                break;
            case SUBTRACTION:
                result = genValue1 - genValue2;
                question = genValue1 + " - " + genValue2;
                break;
            case MULTIPLICATION:
                result = genValue1 * genValue2;
                question = genValue1 + " * " + genValue2;
                break;
            default:
                System.out.println("Invalid operation");
                System.exit(1);

        }
        messageGame[0] = question;
        messageGame[1] = Integer.toString(result);
        return messageGame;
    }
}
