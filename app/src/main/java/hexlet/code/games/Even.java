package hexlet.code.games;

public class Even {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;
    public static String[] even() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        messageGame[0] = "Question: " + genValue;
        String correctAnswer = genValue % 2 == 0 ? "yes" : "no";
        messageGame[1] = correctAnswer;
        return messageGame;
    }
}
