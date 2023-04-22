package hexlet.code.games;

public class Progression {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE_MAS = 100;
    public static final int END_RANGE_STEP = 15;
    public static final int PROGRESSION_SIZE = 10;
    public static final int SIZE_ARRAY = 2;
    public static String[] progression() {
        String[] messageGame = new String[SIZE_ARRAY];
        int[] progressionArray = new int[PROGRESSION_SIZE];
        int startValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE_MAS + 1);
        int genStep = INITIAL_RANGE + (int) (Math.random() * END_RANGE_STEP + 1);
        int randomValue = (int) (Math.random() * progressionArray.length);
        progressionArray[0] = startValue;
        for (int j = 1; j < progressionArray.length; j++) {
            progressionArray[j] = progressionArray[j - 1] + genStep;
        }
        messageGame[0] = Progression.printArrayWithSecretValue(progressionArray, randomValue);
        String correctAnswer = Integer.toString(progressionArray[randomValue]);
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    public static String printArrayWithSecretValue(int[] array, int randomValue) {
        String line = "";
        for (int j = 0; j < array.length; j++) {
            if (j == randomValue) {
                line += ".. ";
                continue;
            }
            line += array[j] + " ";
        }
        return line;
    }
}
