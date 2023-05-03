/**
 * The class implements the game continue the sequence.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

import hexlet.code.Utils;

public class Progression implements Game {


    public static final int END_RANGE_STEP = 15;
    public static final int PROGRESSION_SIZE = 10;
    public static final int SIZE_ARRAY = 2;

    /**
     * The class returns a string with a task for the game Progression.
     * @author Pavel Mikheev
     * @return task for the game Progression
     */

    public String getTask() {
        return "What number is missing in the progression?";
    }

    /**
     * This method returns a question-answer pair for the Progression game.
     * @author Pavel Mikheev
     * @return question-answer pair
     */

    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int[] progressionArray = new int[PROGRESSION_SIZE];
        int startValue = Utils.generateValueWithRange();
        int genStep = Utils.generateSpecialValue(END_RANGE_STEP);
        int randomValue = Utils.generateArrayIndex(progressionArray.length);
        progressionArray[0] = startValue;
        for (int j = 1; j < progressionArray.length; j++) {
            progressionArray[j] = progressionArray[j - 1] + genStep;
        }
        messageGame[0] = getProgressionWithMissingValue(progressionArray, randomValue);
        String correctAnswer = Integer.toString(progressionArray[randomValue]);
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    /**
     * method to hide the value.
     * @author Pavel Mikheev
     * @return string with the elements of the array, including the secret value
     * @param array - array with all elements
     * @param randomValue - secret value
     */

    public String getProgressionWithMissingValue(int[] array, int randomValue) {
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
