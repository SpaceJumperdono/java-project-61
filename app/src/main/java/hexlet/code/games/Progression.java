/**
 * The class implements the game continue the sequence
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Progression implements Game {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE_MAS = 100;
    public static final int END_RANGE_STEP = 15;
    public static final int PROGRESSION_SIZE = 10;
    public static final int SIZE_ARRAY = 2;

    /**
     * The class returns a string with a task for the game Progression
     * @author Pavel Mikheev
     */

    public String getTask() {
        return "What number is missing in the progression?";
    }

    /**
     * This method returns a question-answer pair for the Progression game
     * @author Pavel Mikheev
     */

    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int[] progressionArray = new int[PROGRESSION_SIZE];
        int startValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE_MAS + 1);
        int genStep = INITIAL_RANGE + (int) (Math.random() * END_RANGE_STEP + 1);
        int randomValue = (int) (Math.random() * progressionArray.length);
        progressionArray[0] = startValue;
        for (int j = 1; j < progressionArray.length; j++) {
            progressionArray[j] = progressionArray[j - 1] + genStep;
        }
        messageGame[0] = printArrayWithSecretValue(progressionArray, randomValue);
        String correctAnswer = Integer.toString(progressionArray[randomValue]);
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    /**
     * The method returns a string with the elements of the array, including the secret value
     * @author Pavel Mikheev
     */

    public String printArrayWithSecretValue(int[] array, int randomValue) {
        StringBuilder line = new StringBuilder();
        for (int j = 0; j < array.length; j++) {
            if (j == randomValue) {
                line.append(".. ");
                continue;
            }
            line.append(array[j]).append(" ");
        }
        return line.toString();
    }
}
